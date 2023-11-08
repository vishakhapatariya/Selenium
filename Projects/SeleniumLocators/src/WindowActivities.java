import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		
		// Invoke Browsser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Run in maximize mode
		driver.manage().window().maximize();
		
		// Hit URL on Browser
		driver.get("https://google.com");
		
		// Navigate to another page
		driver.navigate().to("https://mail.google.com");
		
		// Go back to previous page
		driver.navigate().back();

		// Go to forward page
		driver.navigate().forward();
		
	}
}
