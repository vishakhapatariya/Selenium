import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/");
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();
		
	}

}
