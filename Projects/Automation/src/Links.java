import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		// 1. Count the links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		// 2. Count the links of footer section
		
		// Without limiting webDriver Scope
		System.out.println(driver.findElements(By.cssSelector("div[id='gf-BIG'] a")).size());
	
		// Limiting webDriver Scope
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		
		// 3. Count the links of a Column
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
	
		
		// 4. Open Every link in a new Tab
		int countOfLinks = columnDriver.findElements(By.tagName("a")).size();
		
		for(int i=1;i<countOfLinks;i++) {
			String clickOnLinkNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkNewTab);
		}
		
		// 5. Iterate through every tab and get the Title
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
				
	}
}
