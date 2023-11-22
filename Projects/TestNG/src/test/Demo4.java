package test;

import org.testng.annotations.Test;

public class Demo4 {
	
	@Test
	public void webLoginHomeLoan()
	{
		// Selenium
		System.out.println("Webloginhome");
	}
	
	@Test(groups= {"smoke"})
	public void mobileLoginHomeLoan()
	{
		// Appium
		System.out.println("Mobileloginhome");
	}
	
	@Test
	public void loginAPIHomeLoan()
	{
		// Rest API Automation
		System.out.println("LoginAPIhome");
	}

}
