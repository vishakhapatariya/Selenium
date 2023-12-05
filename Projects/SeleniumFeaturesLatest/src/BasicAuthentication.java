import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("httpbin.org");
		
		((HasAuthentication)driver).register(uriPredicate, UsernameAndPassword.of("foo", "bar"));
		driver.get("https://httpbin.org/basic-auth/foo/bar");
				
	}

}
