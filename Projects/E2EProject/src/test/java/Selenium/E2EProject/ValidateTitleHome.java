package Selenium.E2EProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePageObject;
import resources.base;

public class ValidateTitleHome extends base{

	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validTitle() throws IOException {
	
		// Compare the text from the browser with actual text
		HomePageObject homepage = new HomePageObject(driver);
		
		AssertJUnit.assertEquals(homepage.getTitle().getText(), "Featured Courses");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
