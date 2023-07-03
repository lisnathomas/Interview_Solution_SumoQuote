package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Demo_1 {
	
	//Pre-requsite conditions. 
	
	@BeforeSuite
	public void setUP() { 
	System.out.println("Setting up system properties");
	}
  
	@BeforeTest
	public void openBrowser() {
		System.out.println("Opening chrome browser");
	}
	
	@BeforeClass
	public void getURL() {
    System.out.println("Hitting the URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("User enters correct credentials for login");
	}
	
	@Test
	public void getHomePageTitle() {
		System.out.println("Testing for home page");
	}
	
	@Test
	public void verifyLogo() {
		System.out.println("Company logo is perfect");
	}
	
	//post-requisite conditions. 
	
	@AfterMethod
	public void logOut() {
		System.out.println("User gets logged out");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing chrome browser");
	}
	
	@AfterTest
	public void deleteCookies(){
		System.out.println("Clearing browsing history");
	}
	
	@AfterSuite
	public void xyz () {
		System.out.println("After suite");
	
	}
}






/*
There are 9 annotations in TestNg:

1. @Beforesuit
2. @BeforeTest
3. @BeforeClass
4. @BeforeMethod
5. @Test
6. @AfterMethod
7. @AfterClass
8. @AfterTest
9. @AfterSuite

-->Annotations are sequence where how TestNg are acossiated. 
-->If we are using an annotation, there will be one method attached. 
-->Right after annotation, method will be initialized
-->All test cases will @Test annotation.

How many test cases is depends on how many test annotations are there
when we execute test annotation, before and aftermethod will execute.
*/