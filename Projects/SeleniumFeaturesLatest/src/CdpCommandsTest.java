import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.emulation.Emulation;

public class CdpCommandsTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();
		
		Map deviceMetrics = new HashMap();
		deviceMetrics.put("width",600);
		deviceMetrics.put("height",1000);
		deviceMetrics.put("deviceScaleFactor",50);
		deviceMetrics.put("mobile",true);
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics)
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Library")).click();
		
	}

}
