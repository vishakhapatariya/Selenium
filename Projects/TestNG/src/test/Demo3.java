package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
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
	
	@Test(dataProvider="getData")
	public void xsignInAPICarLoan(String username,String password)
	{
		// Rest API Automation
		System.out.println("xsignInAPIcar");
		System.out.println(username+" "+password);
	}
	
	
	@DataProvider
	public Object[][] getData() {
		// Scenario
		// 1st - username and password - Good credit history
		// 2nd - username and password - No credit history
		// 3rd - username and password - Fraudelent credit history
		
		Object[][] data = new Object[3][2];
		// Set - 1
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		// Set - 1
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		// Set - 1
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}

}
