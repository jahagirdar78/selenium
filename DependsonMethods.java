package com.test.Methods;

import org.testng.annotations.Test;

public class DependsonMethods {
		
		@Test(dependsOnMethods = {"testCase2"})
		public void testCase1(){
			System.out.println("Test Case 1");
		}
		@Test
		public void testCase2(){
			System.out.println("Test Case 2");
		}
	 
	}

