import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {

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
		
		// Take Screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/Projects/Automation/src/screenshot.png");
		FileUtils.copyFile(src,dest);
		
	}

}
