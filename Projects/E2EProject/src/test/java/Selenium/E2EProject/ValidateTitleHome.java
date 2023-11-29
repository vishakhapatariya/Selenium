package Selenium.E2EProject;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.HomePageObject;
import resources.base;

public class ValidateTitleHome extends base{

	@Test
	public void validTitle() throws IOException {
		driver = initializeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		
		// Compare the text from the browser with actual text
		HomePageObject homepage = new HomePageObject(driver);
		
		Assert.assertEquals(homepage.getTitle().getText(), "Featured Courses");
		
	}
}
