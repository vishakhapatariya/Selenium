package Selenium.E2EProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Base64;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePageObject;
import resources.base;

public class ValidateTitleHome extends base{
	
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateTitleHome.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
	}
	
	@Test
	public void validTitle() throws IOException {
	
		// Compare the text from the browser with actual text
		HomePageObject homepage = new HomePageObject(driver);
		
		AssertJUnit.assertEquals(homepage.getTitle().getText(), "Featured Courses123");
		
		log.info("Successfully validated title");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}