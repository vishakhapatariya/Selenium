package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectFactory {
	
	// Login page class implemented in Page Object Factory method
	
	WebDriver driver;
	public LoginPageObjectFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(name="proceed")
	WebElement submitButton;
	
	@FindBy(linkText="rediff.com")
	WebElement homeLink;
	
	public WebElement emailId() {
		return username;
	}
	
	public WebElement password() {
		return pass;
	}

	public WebElement submitLogin() {
		return submitButton;
	}
	
	public WebElement home() {
		return homeLink;
	}
}
