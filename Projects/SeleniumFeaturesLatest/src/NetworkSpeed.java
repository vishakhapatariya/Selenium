import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.network.Network;
import org.openqa.selenium.devtools.v119.network.model.ConnectionType;

public class NetworkSpeed {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		// This will reduce Network Speed
		devTools.send(Network.emulateNetworkConditions(false, 3000, 20000, 10000, Optional.of(ConnectionType.ETHERNET)));
		
		// This will execute when Network is Disconnected
		devTools.addListener(Network.loadingFailed(), loadingFailed ->
		{
			System.out.println(loadingFailed.getErrorText());
			System.out.println(loadingFailed.getTimestamp());
		});
		
		
		// Test Case
		long startTime = System.currentTimeMillis();
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		
		String title = driver.findElement(By.cssSelector(".default-ltr-cache-111d53l")).getText();
		
		System.out.println(title);
		
		driver.close();
		
		
		// Test Case
//		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
//		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
//		driver.close();
		
		
		long endTime = System.currentTimeMillis();
	
		System.out.println(endTime - startTime);
		
	}

}
