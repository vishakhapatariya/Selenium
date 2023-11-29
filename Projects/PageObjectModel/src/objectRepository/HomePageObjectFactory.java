package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjectFactory {
	
	// Home page class implemented in Page Object Factory method

	WebDriver driver;
	public HomePageObjectFactory(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(id="srchquery_tbox")
	WebElement searchtext;
	
	@FindBy(xpath="//input[@class='newsrchbtn']")
	WebElement searchButton;
	
	public WebElement searchTxt() {
		return searchtext;
	}
	
	public WebElement searchBtn() {
		return searchButton;
	}
	
}
