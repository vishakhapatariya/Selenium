import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {

		// Handling HTTPS certifications
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver(options);
	
		// Hit URL on Browser
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
	
	}
}
