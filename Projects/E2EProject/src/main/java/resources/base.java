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

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
	
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");

		prop.load(fis);
		
		// mvn test -Dbrowser=chrome
		String browserName = System.getProperty("browser");
//		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			// Invoke chrome browser                   
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chome_driver/chromedriver-linux64/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			// Invoke firefox browser
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
