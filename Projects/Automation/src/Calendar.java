import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calendar {

	public static void main(String[] args) throws InterruptedException {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		
		// Hit URL on Browser
		driver.get("https://www.path2usa.com/travel-companion/");
		
		// Scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)", "");
		Thread.sleep(2000);
		
		// Click on Date picker
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();

		// Select Month
		while(!driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("August")) {
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
			Thread.sleep(500);
		}
		
		// Select Date
		List<WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day"));
		int count = driver.findElements(By.cssSelector(".flatpickr-day")).size();
		for(int i=1;i<count;i++) {
			String text = driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("20")) {
				driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
			}
		}	
		
	}
}
