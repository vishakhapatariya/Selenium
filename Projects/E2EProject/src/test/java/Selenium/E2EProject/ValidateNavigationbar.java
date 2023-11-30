package Selenium.E2EProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObject.HomePageObject;
import resources.base;

public class ValidateNavigationbar extends base{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validNavbar() {
		
		HomePageObject homepage = new HomePageObject(driver);
		
		AssertJUnit.assertTrue(homepage.getNavbar().isDisplayed());
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
