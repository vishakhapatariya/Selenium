import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RSATest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
//		caps.setPlatform(Platform.LINUX);
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.120:4444"), caps);
		
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
	
	}

}
