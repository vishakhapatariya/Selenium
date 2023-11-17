import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
				
	}
}
