import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAutomation {

	public static void main(String[] args) {

		// Invoke Chrome Browser and hit URL
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Enter name
		String name = "Vishakha";
		driver.findElement(By.id("name")).sendKeys(name);
		
		// Click on 'Alert' Button
		driver.findElement(By.id("alertbtn")).click();
		
		// Grab Text from Alert
		System.out.println(driver.switchTo().alert().getText());
		
		// Click on 'OK' in Alert
		driver.switchTo().alert().accept();
		
		// Click on 'Confirm' Button
		driver.findElement(By.id("confirmbtn")).click();
		
		// Grab Text from Confirm Alert
		System.out.println(driver.switchTo().alert().getText());
		
		// Click on 'Cancel' in Confirm Alert
		driver.switchTo().alert().dismiss();
		
	}

}
