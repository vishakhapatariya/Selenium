package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("login1");
	By pass = By.id("password");
	By submitButton = By.name("proceed");
	By homeLink = By.linkText("rediff.com");
	
	public WebElement emailId() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(pass);
	}

	public WebElement submitLogin() {
		return driver.findElement(submitButton);
	}
	
	public WebElement home() {
		return driver.findElement(homeLink);
	}
}
