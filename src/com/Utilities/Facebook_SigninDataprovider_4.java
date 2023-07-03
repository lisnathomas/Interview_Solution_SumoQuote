package com.Utilities;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_SigninDataprovider_4 {

//webdriver is an interface.
	//We used polymorphism below. object driver is crating for chromedriver and poinint to wendriver.
	//Following line java will only come to know at run time, thats why it is called dynamic polymorphism
	//if we declare like this driver object now can access objects mentione din driver interface
	// Chromedriver is a classs that implements webdriver.
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
	}
	
	@DataProvider 
	public Iterator<Object[]> testdata() {
		ArrayList<Object[]>testdata = TestUtilities_3.getdata();
		return testdata.iterator();
	}
	
	@Test(dataProvider = "testdata")
	public void login(String username, String password) {
		
		driver.findElement(By.id("email")).sendKeys("username");	
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.id("login")).click();
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}

/*
How to implement dynamic polymorphism in your  project?

We used chromedriver class to implement webdriver interface. We amde object driver for chromedriver class. This chromedriver
class is also implementing this webdriver interface. 

If we use any other interface like Alerts it will throw error and chromodriver doesn't implement. Chromedriver will only implement weddriver interface
and it will identify Java at runtime and thus dynamic polymorphism.
*/