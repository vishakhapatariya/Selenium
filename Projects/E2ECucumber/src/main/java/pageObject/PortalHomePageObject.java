package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePageObject {

	WebDriver driver;
	
	private By search = By.cssSelector("#search-courses");
	
	public PortalHomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSearchBox() {
		return driver.findElement(search);
	}
}
