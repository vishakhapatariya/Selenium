import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class RalativeLocators {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/angularpractice/");
				
		
		// Relative Locator - above()
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		
		// Relative Locator - below()
		WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		
		
		// Relative Locator - toLeftOf()
		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

		
		// Relative Locator - toRightOf()
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
	
	}

}
