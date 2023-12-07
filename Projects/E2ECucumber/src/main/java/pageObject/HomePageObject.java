package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	private By login = By.cssSelector("a[href*='sign_in']");
	private By title = By.xpath("//div[@class='pull-left']/h2");
	private By header = By.cssSelector("div[class*='col-md-6'] h2 span");
	private By navbar = By.cssSelector("[class='main-menu']");
	private By popUpCancleBtn = By.xpath("//button[text()='NO THANKS']");
	
	public WebElement getlogin() {
		return driver.findElement(login);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavbar() {
		return driver.findElement(navbar);
	}
	
	public WebElement getHeader() {
		return driver.findElement(header);
	}
	
	public WebElement getPopUpCancleBtn() {
		return driver.findElement(popUpCancleBtn);
	}
	
	public List<WebElement> getPopUp() {
		return driver.findElements(popUpCancleBtn);
	}

}
