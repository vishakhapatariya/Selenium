import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsAutomation {

	public static void main(String[] args) throws InterruptedException {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// CheckBoxes

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		// Select the CheckBox
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		// Count the number of CheckBoxes in the Page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		
		
		// Updated DropDown

		// Click on Dropdown
		driver.findElement(By.id("divpaxinfo")).click();

		// Get text before selecting
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"1 Adult");

		Thread.sleep(1000);
		// Add 5 Adults by clicking on "+"
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		// Click on Done Button
		driver.findElement(By.id("btnclosepaxoption")).click();

		// Get text after selecting
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");

	}
}
