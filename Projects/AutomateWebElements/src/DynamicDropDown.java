import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		// Click on 'From' DropDown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		
		// Select item from 'From' DropDown
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(1000);
		// Select item from 'To' DropDown
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// Parent-Child relationship locator to Identify the objects Uniquely
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}
}
