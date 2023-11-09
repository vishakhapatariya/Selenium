import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Click on Dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		
		// Get text before selecting
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		// Add 5 Adults by clicking on "+"
		// Using while loop
//		int i=1;
//		while(i<5) {
//			// Click on "+"
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		
		// Using for loop
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		// Click on Done Button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// Get text after selecting
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}
}
