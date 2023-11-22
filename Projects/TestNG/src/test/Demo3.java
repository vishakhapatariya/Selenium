package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	
	@Parameters({"URL"})
	@Test(dependsOnMethods= {"loginAPICarLoan","xsignInAPICarLoan"})
	public void webLoginCarLoan(String urlName)
	{
		// Selenium
		System.out.println("Weblogincar");
		System.out.println(urlName);
	}
	
	@Test(groups= {"smoke"})
	public void webSignInCarLoan()
	{
		// Selenium
		System.out.println("Web sign in car");
	}
	
	@Test(enabled=false)
	public void webSignOutCarLoan()
	{
		// Selenium
		System.out.println("Web sign out car");
	}
	
	@Test(timeOut=4000)
	public void mobileLoginCarLoan()
	{
		// Appium
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@Test
	public void loginAPICarLoan()
	{
		// Rest API Automation
		System.out.println("LoginAPIcar");
	}
	
	@Test
	public void xsignInAPICarLoan()
	{
		// Rest API Automation
		System.out.println("xsignInAPIcar");
	}

}
