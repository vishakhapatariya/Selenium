import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCart {

	public static void main(String[] args) throws InterruptedException {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		// Creating Array of Items to be Added to Cart
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
		
		// Convert Array into arrayList for easy search
		List itemsNeededList = Arrays.asList(itemsNeeded);
					
		// Get product names
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		int count = 0;
		
		// Iterate through product names
		for(int i=0;i<products.size();i++) {
			
			// Split the product name with '-'
			String[] name = products.get(i).getText().split("-");
			// trim space from name
			String formattedName = name[0].trim();
			
			// Check whether extracted name is present in ArrayList or not
			if(itemsNeededList.contains(formattedName)) {
				// Click on 'ADD TO CART' Button
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				count++;
				if(count==itemsNeeded.length) {
					break;
				}
			}
		}
		
	}
}
