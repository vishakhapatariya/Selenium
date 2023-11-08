import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Resolve Synchronization Issue
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Enter URL in browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/#");

		// Enter text in textBox using id and name Locators
		driver.findElement(By.id("inputUsername")).sendKeys("Vishakha");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello");
		// Click on Button using className Locator
		driver.findElement(By.className("signInBtn")).click();

		// Extract text from Browser
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// Click on the link using linkText Locator
		driver.findElement(By.linkText("Forgot your password?")).click();

		// Enter Name using Xpath Locator
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vishakha");

		// Enter email using CSS Selector Locator
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vishakha123@gmail.com");

		// Clearing email text field using xpath Locator with index
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		// Enter email again using CSS Selector Locator with index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("vishakha@gmail.com");

		// Enter Phone No. using Xpath Locator with parent to child tags
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9812763405");

		// Click on Reset Login Button using CSS Selector Locator
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		// Extract text from Browser using CSS Selector Locator
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	}
}
