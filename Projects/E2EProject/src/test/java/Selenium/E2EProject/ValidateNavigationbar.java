package Selenium.E2EProject;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObject.HomePageObject;
import resources.base;

public class ValidateNavigationbar extends base{
	
	private static Logger log = LogManager.getLogger(ValidateNavigationbar.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
	}
	
	@Test
	public void validNavbar() {
		
		HomePageObject homepage = new HomePageObject(driver);
		
		AssertJUnit.assertTrue(homepage.getNavbar().isDisplayed());
		
		log.info("Navbar is displayed Successfully");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
