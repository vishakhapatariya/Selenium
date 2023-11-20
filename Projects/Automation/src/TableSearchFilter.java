import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSearchFilter {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		// Enter text in Search Box
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		// Capture all webElements into list
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		// Filtering WebElements which is contains the text
		List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		
		// Validating if count is same before and after filtering
		Assert.assertEquals(veggies.size(), filteredList.size());
				
	}

}
