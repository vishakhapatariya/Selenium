import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.emulation.Emulation;

public class SetGeoLocation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();
		
		Map<String,Object> coordinates = new HashMap<String,Object>();
		coordinates.put("latitude",29);
		coordinates.put("longitude",106);
		coordinates.put("accuracy",1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		
		String title = driver.findElement(By.cssSelector(".default-ltr-cache-111d53l")).getText();
		System.out.println(title);
		
	}

}
