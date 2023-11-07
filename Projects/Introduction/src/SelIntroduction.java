import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		
		// Invoking Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Invoking Firefox Browser - geckodriver
		//System.setProperty("webdriver.gecko.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/firefox_driver/geckodriver-v0.33.0-linux64/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		
		// Hit URL on browser
		driver.get("https://www.youtube.com/");
				
		// Getting title of website
		System.out.println(driver.getTitle());
		
		// Getting URL of current website
		System.out.println(driver.getCurrentUrl());
		
		// Closing the website
		driver.close();
		// driver.quit();

	}

}
