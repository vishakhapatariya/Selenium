package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo2 {

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("Good Morning!");
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last");
	}
	
	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("After Every Method");
	}
	
}
