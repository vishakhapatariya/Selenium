import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String name = "Vishakha";
		
		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Resolve Synchronization Issue
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Getting password from Forgot password
		String password = getPassword(driver);
				
		// Hit URL on browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// Enter Username
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		// Enter Password
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		// Click CheckBox
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		
		// Click on Submit button
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	
		Thread.sleep(2000);
		
		// Accessing Successfully logged in text
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		// Validate successfully logged in text
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
		// Validate name
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
	
		// Click Log Out Button by generating Xpath based on button text
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
				
		// Closing the browser
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException{
		
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// Click on Forgot password link
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		// Click on reset login button
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(1000);
		
		// Get password text
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
		// Split password from text
		String[] passArray = passwordText.split("'");
		
		// Method 1
//		String[] passArray2 = passArray[1].split("'");
//		System.out.print(passArray2[0]);
		
		// Method 2
		String password = passArray[1].split("'")[0];
		
		return password;
	}
}
