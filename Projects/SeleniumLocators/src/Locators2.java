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
		
		// Hit URL on browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// Enter Username
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		// Enter Password
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
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
}
