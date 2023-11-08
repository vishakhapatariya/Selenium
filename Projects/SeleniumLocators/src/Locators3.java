import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators3 {

	public static void main(String[] args) {
		
		// Invoke Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Hit URL on browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Identify locators using Parent to child with Xpath traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
		
		// Identify locators using Siblings with Xpath traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
	}
}
