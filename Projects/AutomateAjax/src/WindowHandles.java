import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static void main(String[] args) {
		
		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Hit URL on browser
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		// Click on Link
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		// Fetching ID of all the windows
		Set<String> windows = driver.getWindowHandles();
		
		// Iterate through Set
		Iterator<String> It = windows.iterator();
		String parentId = It.next();
		String childId = It.next();
		
		// Switch to child window
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		// Switch to parent window
		driver.switchTo().window(parentId);
		
		// Enter emailId
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
