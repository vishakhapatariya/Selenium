package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassPageObject {
	
	WebDriver driver;
	
	public ForgotPassPageObject(WebDriver driver) {
		this .driver = driver;
	}
	
	private By email = By.id("email");
	private By button = By.name("commit");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getButton() {
		return driver.findElement(button);
	}

}
