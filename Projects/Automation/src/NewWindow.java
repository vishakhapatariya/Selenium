import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		// Open new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		// Get Id of all the tabs
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String firstTabId = it.next();
		String secondTabId = it.next();
		
		// Switch to second window
		driver.switchTo().window(secondTabId);
		
		// Hit URL on second Tab
		driver.get("https://rahulshettyacademy.com/");
		
		// Get text from second tab
		String courseName = driver.findElement(By.xpath("//div[@id='courses-block']/div[1]//h2")).getText();
		
		// Switch to first window
		driver.switchTo().window(firstTabId);
		
		// Enter text
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		// Taking WebElement Partial Screenshot
		File src = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/Projects/Automation/src/partialScreenshot.png"));
				
		// Close all the tabs
		driver.quit();
	}

}
