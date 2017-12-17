package com.test.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTitles {


	 /**
	 * getTitle()

	Get Title selenium method is useful in 
	capture or get the webpages page titles to 
	assert whether particular webpage is loaded 
	correctly or not in your test scripts.

	Syztax : driver.getTitle();
	 */
	
	WebDriver  driver;
	
	@Test(invocationCount=1)
	public void verifyTitle(){		

		driver = new FirefoxDriver();

		driver.get("http://www.learn-jmeter.blogspot.in");		

		String actT =driver.getTitle();
		String expT="learn jmetr";
		
		Assert.assertEquals(actT, expT, "message");
		
	}
	@Test
	public void verifyTitle1(){		

		driver = new FirefoxDriver();

		driver.get("http://www.lea.in");		

	//	String actT =driver.getTitle();
		//String expT="learn-jmeter";
		
	//	Assert.assertEquals(actT, expT, "message");
		
	}		
}
