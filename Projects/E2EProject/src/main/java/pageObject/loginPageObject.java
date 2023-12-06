package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	WebDriver driver;
	
	private By emailText = By.xpath("//input[@name='email']");
	private By passText = By.id("password");
	private By submitButton = By.name("commit");
	private By forgotPass = By.cssSelector("a[href*='forgot']");
	
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
	
	public ForgotPassPageObject getForgotPass() {
		driver.findElement(forgotPass).click();
		return new ForgotPassPageObject(driver);
	}

}
