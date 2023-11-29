package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	WebDriver driver;
	
	By emailText = By.id("email");
	By passText = By.id("password");
	By submitButton = By.name("commit");
	
	public loginPageObject(WebDriver driver) {
		this .driver = driver;
	}
	
	
	public WebElement getEmail() {
		return driver.findElement(emailText);
	}
	
	public WebElement getPassword() {
		return driver.findElement(passText);
	}
	
	public WebElement getSubmitbtn() {
		return driver.findElement(submitButton);
	}

}
