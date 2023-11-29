package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By login = By.cssSelector("a[href*='sign_in']");
	
	public WebElement loginLink() {
		return driver.findElement(login);
	}

}
