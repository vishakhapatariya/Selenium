package Selenium.E2EProject;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base{
	
	@Test
	public void basePageNavigation() throws IOException {
		driver=initializeDriver();
		driver.get("https://qaclickacademy.com/");
	}
}
