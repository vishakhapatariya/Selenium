package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjectModel {
	
	public WebDriver driver;
	
	public HomePageObjectModel(WebDriver driver) {
		this.driver = driver;
	}
	
	By login = By.cssSelector("a[href*='sign_in']");
	
	public WebElement loginLink() {
		return driver.findElement(login);
	}

}
