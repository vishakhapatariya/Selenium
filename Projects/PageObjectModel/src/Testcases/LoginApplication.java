package Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePageObjectFactory;
import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;

public class LoginApplication {
	
	// Login page class implemented in normal page object pattern style
	
	@Test
	public static void login() {

		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rl = new RediffLoginPage(driver);
		rl.emailId().sendKeys("vishakha@gmail.com");
		rl.password().sendKeys("123456");
		rl.submitLogin().click();
		rl.home().click();
		
		HomePageObjectFactory rh = new HomePageObjectFactory(driver);
		rh.searchTxt().sendKeys("rediff"+Keys.ENTER);
		
	}

}
