package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
	
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");

		prop.load(fis);
		
		// mvn test -Dbrowser=chrome
//		String browserName = System.getProperty("browser");
		String browserName = prop.getProperty("browser");
		
		if(browserName.contains("chrome")) {
			// Invoke chrome browser                   
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver-linux64/chromedriver");
			
			ChromeOptions options = new ChromeOptions();
			if(browserName.contains("headless")) {
				options.addArguments("--headless=new");
			}
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("firefox")) {
			// Invoke firefox browser                                                     
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver-v0.33.0-linux64/geckodriver");
			
			FirefoxOptions options = new FirefoxOptions();
			if(browserName.contains("headless")) {
				options.addArguments("--headless=new");
			}
			driver = new FirefoxDriver(options);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	
	
	public String getScreenshotPath(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"/reports/"+testCaseName;
		FileUtils.copyFile(source, new File(dest));
		return dest;
	}
}
