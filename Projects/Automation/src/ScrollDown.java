import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Scroll the window
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		// Scroll the table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
				
		
		// Sum of Grid values
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0;i<values.size();i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		// Validating the Sum		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
	
	}
}
