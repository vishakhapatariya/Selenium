import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSorting {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		
		// Click on Column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// Capture all webElements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		// Capture text of all webElements into new List
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// Sort the original list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		// Compare originalList and sortedList
		Assert.assertTrue(originalList.equals(sortedList));
		
	}

}
