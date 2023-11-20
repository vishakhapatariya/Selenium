import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		// Iterate over all links in the page to validate broken Links mechanism
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		// Soft Assertion in Selenium Web driver
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links) {

			// Get URL tied up to the link
			String url = link.getAttribute("href");
			
			// Open Connection method to identify status codes of the links
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			
			a.assertTrue(respCode<400, "The link with text "+link.getText()+" is broken with code "+respCode);
			
		}
		
		a.assertAll();
		
	}

}
