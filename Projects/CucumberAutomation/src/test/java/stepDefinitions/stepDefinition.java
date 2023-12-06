package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigated to Login URL");
	}
	
/*	@When("User login into application with username and password")
	public void user_login_into_application_with_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logged In Successfully");
	} */
	
	@When("User login into application with username {string} and password {string}")
	public void user_login_into_application_with_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logged In Successfully with username : "+string+", password : "+string2);
	}
	
	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validated Home Page");
	}
	
	@Then("Cards displayed {string}")
	public void cards_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Validated Cards displayed "+string);
	}
	
}
