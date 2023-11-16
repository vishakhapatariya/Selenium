import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Hit URL on browser
		driver.get("https://www.amazon.in/");
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		Actions a = new Actions(driver);
		
		// Move cursor to specific element
		a.moveToElement(move).build().perform();
				
		// Enter and Select the text in Search Box
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		// Right Click
		a.moveToElement(move).contextClick().build().perform();
		
	}

}
