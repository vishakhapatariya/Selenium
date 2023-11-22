package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Hello");
	}
	
	@BeforeTest
	public void firstExecution() {
		System.out.println("I will execute first");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Bye");
	}
	
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Before every method");
	}

}
