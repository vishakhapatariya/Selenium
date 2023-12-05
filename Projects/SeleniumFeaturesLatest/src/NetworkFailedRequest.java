import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.fetch.Fetch;
import org.openqa.selenium.devtools.v119.network.model.ErrorReason;
import org.openqa.selenium.devtools.v119.fetch.model.RequestPattern;

public class NetworkFailedRequest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();
		
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		
		// 1st parameter - java.util.Optional<java.lang.String> urlPattern
		// 2nd parameter - java.util.Optional<org.openqa.selenium.devtools.v119.network.model.ResourceType> resourceType
		// 3rd parameter - java.util.Optional<org.openqa.selenium.devtools.v119.fetch.model.RequestStage> requestStage
		Optional<List<RequestPattern>> patterns = Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"), Optional.empty(), Optional.empty())));
		
		devTools.send(Fetch.enable(patterns, Optional.empty()));
		
		devTools.addListener(Fetch.requestPaused(), request ->
		{
			devTools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
		});
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		
	}

}
