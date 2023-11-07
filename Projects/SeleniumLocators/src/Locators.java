import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Enter URL in browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/#");

		// Enter text in textBox using id and name Locators
		driver.findElement(By.id("inputUsername")).sendKeys("Vishakha");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello");
		// Click on Button using className Locator
		driver.findElement(By.className("signInBtn")).click();
	}
}
