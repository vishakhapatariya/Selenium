import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCart {

	public static void main(String[] args) throws InterruptedException {

		// Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Hit URL on Browser
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		// Creating Array of Items to be Added to Cart
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
		
		addItem(driver, itemsNeeded);
		
		// Click on Cart
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		// Click on 'PROCEED TO CHECKOUT' Button
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		// Enter promo code in EditBox
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		
		// Click on 'Apply' Button
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		// Grab the text
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	
	
	public static void addItem(WebDriver driver, String[] itemsNeeded) {
				
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
