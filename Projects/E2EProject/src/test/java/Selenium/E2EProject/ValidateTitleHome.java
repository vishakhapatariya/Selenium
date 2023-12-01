package Selenium.E2EProject;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.HomePageObject;
import resources.base;

public class ValidateTitleHome extends base{
	
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateTitleHome.class.getName());
	HomePageObject homepage;
	
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
		homepage = new HomePageObject(driver);
		
		Assert.assertEquals(homepage.getTitle().getText(), "Featured Courses");
		
		log.info("Successfully validated title");
	}
	
	@Test
	public void validHeader() {
		homepage = new HomePageObject(driver);
		Assert.assertEquals(homepage.getHeader().getText(), "An Academy to Learn Earn & Shine  in your QA Career");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
