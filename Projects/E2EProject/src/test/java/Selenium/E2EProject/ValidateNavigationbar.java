package Selenium.E2EProject;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageObject;
import resources.base;

public class ValidateNavigationbar extends base{
	
	@Test
	public void validNavbar() throws IOException {
		driver=initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		HomePageObject homepage = new HomePageObject(driver);
		
		Assert.assertTrue(homepage.getNavbar().isDisplayed());
		
	}

}
