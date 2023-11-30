package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
	
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/Projects/E2EProject/src/main/java/resources/data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			// Invoke chrome browser
			System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			// Invoke firefox browser
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
}
