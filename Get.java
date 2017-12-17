package com.test.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Get {

	//**
	
	//WebDriver Method : get(String ar0)
//	WebDriver get method is useful in navigate to particular
	//web page in the current window browser and it will get the 
	//web page with the help of HTTP protocol.
//	Systax : driver.get(String arg0)
//	Example:driver.get("http://www.learn-jmeter.blogspot.in") //
	
	WebDriver driver;
	@Test

	public void verifyTitle(){		

		driver = new FirefoxDriver();

		driver.get("http://www.learn-jmeter.blogspot.in");		

	}
}
