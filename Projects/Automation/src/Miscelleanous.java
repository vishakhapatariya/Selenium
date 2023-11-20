import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Delete all the cookies in the browser
		driver.manage().deleteAllCookies();		
		
		// Delete a cookie by name
		//driver.manage().deleteCookieNamed("abcd");
	
		// Hit URL on Browser
		driver.get("https://google.com/");
		
	}

}
