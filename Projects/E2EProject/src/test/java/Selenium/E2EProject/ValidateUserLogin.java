package Selenium.E2EProject;


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import pageObject.HomePageObject;
import pageObject.loginPageObject;
import resources.base;

public class ValidateUserLogin extends base{
	
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateUserLogin.class.getName());
	
	@BeforeMethod
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password, String text) throws IOException {
		
		// Click on Login Page link - HomePageObject
		HomePageObject homepage = new HomePageObject(driver);
		homepage.getloginLink().click();
		
		// Enter details and click on submit - loginPageObject
		loginPageObject loginpage = new loginPageObject(driver);
		loginpage.getEmail().sendKeys(username);
		loginpage.getPassword().sendKeys(password);
		// System.out.println(text);
		loginpage.getSubmitbtn().click();
		log.info(text+" user is logging.");
		
	}
	
	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// Column stands for how many values per each test
		
		Object[][] data = new Object[2][3];
		
		// Test data - 1
		data[0][0] = "nonrestricteduser@gmail.com";
		data[0][1] = "123456";
		data[0][2] = "Restricted User";
		
		// Test data - 2
		data[1][0] = "restricteduser@gmail.com";
		data[1][1] = "1234567";
		data[1][2] = "Non Restricted User";
		
		return data;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
