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
	By title = By.xpath("//div[@class='pull-left']/h2");
	
	By navbar = By.cssSelector("[class='main-menu']");
	
	
	public loginPageObject getlogin() {
		driver.findElement(login).click();
		loginPageObject loginpage = new loginPageObject(driver);
		return loginpage;
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavbar() {
		return driver.findElement(navbar);
	}

}
