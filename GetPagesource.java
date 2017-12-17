package com.test.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 WebDriver Method : getPageSource()

WebDriver getPageSource will useful in 
get particular webpage source code means 
when you click on right click on webpage you
 will see option view pagesource,this method also
  works same and it will print in Eclipse Console or
   any other tool which ever you are using.

Syntax : driver.getPageSource();
 *
 */
public class GetPagesource {

	
	WebDriver driver;
	
	@Test
	public void verifyTitle(){		

		driver = new FirefoxDriver();

		driver.get("http://www.learn-jmeter.blogspot.in");

		String page_source = driver.getPageSource();

		System.out.println(page_source);

	}
}
