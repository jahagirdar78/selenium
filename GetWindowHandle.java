package com.test.Methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author lenovo
 *
	WebDriver Method : getWindowHandles()

	WebDriver Method getWindowHandles is useful in
	identifying the all open multiple windows in a 
	webpage or return the windows which are open in 
	webpages to switch into particular window to work
	with test scripts as per your requirements to identify the elements.

	Syntax: driver.getWindowHandles();

 */
public class GetWindowHandle {
	
	WebDriver driver;
	

		
		@Test

		public void verifyTitle(){		

			driver = new FirefoxDriver();

			driver.get("https://www.naukri.com");		

			String Pagetitle =driver.getTitle();

			System.out.println(Pagetitle);	

			Set<String> windowslist= driver.getWindowHandles();
			
			System.out.println(windowslist.size());
			System.out.println(windowslist);

			System.out.println("Another Window-"+windowslist);	
	
			for(int i=0;i<windowslist.size();i++){
				
				System.out.println(windowslist);
						
				driver.switchTo().window("Hexaware BPS");
				driver.close();
				
			}
		
		
		
	}
	
	
}
