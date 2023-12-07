package stepDefinitions;

import java.io.IOException;

//import org.junit.Assert;
import org.testng.Assert;
import org.junit.runner.RunWith;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.HomePageObject;
import pageObject.PortalHomePageObject;
import pageObject.loginPageObject;
import resources.base;

@RunWith(Cucumber.class)
public class stepDefinition extends base{
	
	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		driver=initializeDriver();
	}
	
	@Given("Navigate to {string} site")
	public void navigate_to_site(String string) {
		driver.get(string);
	}
	
	@Given("Click on Login link in home page to land on Secure sign in page")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
		HomePageObject homepage = new HomePageObject(driver);
		homepage.getlogin().click();
		
		// Handle Dynamic Pop-Up in Home Page
		if(homepage.getPopUp().size()>0) {
			homepage.getPopUpCancleBtn().click();
		}
	}
	
	@When("User enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String username, String password) {
		loginPageObject loginpage = new loginPageObject(driver);
		loginpage.getEmail().sendKeys(username);
		loginpage.getPassword().sendKeys(password);
		loginpage.getSubmitbtn().click();
	}
	
	@Then("Verify that user is successfully logged in")
	public void verify_that_user_is_successfully_logged_in() {
		PortalHomePageObject portalHome = new PortalHomePageObject(driver);
		Assert.assertTrue(portalHome.getSearchBox().isDisplayed());
	}
	
	@Then("Close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
	
}
