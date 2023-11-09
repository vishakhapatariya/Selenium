import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {

		// Handling AutoSuggestive DropDowns using Selenium

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Enter text in text field
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		// Access list elements
		List<WebElement> options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		// Iterate through list
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}	
		
	}
}
