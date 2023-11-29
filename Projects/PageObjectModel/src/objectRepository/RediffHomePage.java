package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	// Home page class implemented in normal page object pattern style
	
	WebDriver driver;
	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchtext = By.cssSelector("[id='srchquery_tbox']");
	By searchButton = By.xpath("//input[@class='newsrchbtn']");
	
	public WebElement searchTxt() {
		return driver.findElement(searchtext);
	}
	
	public WebElement searchBtn() {
		return driver.findElement(searchButton);
	}
	
}
