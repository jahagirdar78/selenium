package com.test.Methods;


		
	
		import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		
		public class FindelementFindElements {
		public static void main (String [] args){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(WebElement element:link)
		{
		System.out.println(element.getText());
		}
		}
		

	}


