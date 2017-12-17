package com.test.Methods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindow {

	public static void main1(String[] args) {}
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			 driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://Google.com/");
	        // Store and Print the name of the First window on the console
	       // String handle= driver.getWindowHandle();
	       // System.out.println(handle);
	        // Click on the link "Terms"
	        driver.findElement(By.linkText("Terms")).click();
	        //String handle1=driver.getWindowHandle();
	        //System.out.println(handle1);
	        
	         Actions act=new Actions(driver);
	          WebElement event= driver.findElement(By.linkText("My Account"));
	          
	        act.contextClick(event).sendKeys(Keys.ARROW_DOWN).build().perform();
	      Set<String> handle=driver.getWindowHandles();
	          System.out.println(handle);
	        Thread.sleep(5000);
	        for( String handle1: driver.getWindowHandles()){
	        	System.out.println(handle1);
	        }
	        
	      

	        
	}

}
