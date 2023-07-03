package com.TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Facebook_2 {

	ChromeDriver driver; //initializing driver as global, so all method can access
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
	}
	
	@Test (groups="Smoke")
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("hello980@gmail.com");
		driver.findElementByName("pass").sendKeys("password");
		driver.findElementByName("login").click();
	}
	
	@Test(priority=1,dependsOnMethods="login")
	public void title() {
		System.out.println(driver.getTitle());
	}
	
	@Test(groups="Smoke")
	public void getTest() {
		System.out.println("Test 1");
	}
	
	@Test(groups="Regression)")
	public void getTest2() {
		System.out.println("Test 2");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();//browser will close, most cases we use quit
		driver.close();//close current tab
	}
	
}
/*
//we can use priority
//Test cases will executes based on priority
//if no priority has been assigned, test cases will execure based on albhabetical ascneded order
//by default priority will be 0
//Lowest number of priority execute first whuch means 0 will execute first, and 1 will exceire then
//We can also give negative value to priority like, -1, 0, 2, 3
//if both the priorities are same, it will execute in albhabetical sequesntial order.
//if no priority is given it is 0 and will execute alphabetica; order. 

===============================================

dependOnmethods means we are giving output of a test case as input of another tet case.
if the test case failed, then it will skip the next test c
eg: If login test case is failed, the title will get skipped. Bcz title is depends on login.
*/


/*
we can have grouping on TestNG
If we group as smoke, and give name as smoke in testin.xml file only these test cases wil exceite
If we give name as regression in xmal only regression test cases will exceute. 
Smoke testing will perform till build is stable. Smoke cover eveything that is under critical and major functionality. 
Here there are 4 test cases and two found as critical functionality. So this needs to exceut everyday
Critical and major funcyionality will exceute daily bcz it can faile if developer make changes to any other functionality. All codes are interrelated.

*/

/*
If we are only runing smoke using xml, then initialize chromedriver, before it will execute only smoke, it won't execute before method. I

*/