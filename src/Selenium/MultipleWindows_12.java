package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows_12 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		WebElement fb = driver.findElementByLinkText("Facebook");
		jse.executeScript("arguments[0].click()", fb);
		
		Set<String> allwindows = driver.getWindowHandles();//this will create a set of Window IDs
		Iterator<String> it = allwindows.iterator();//this will create iterator to pull data from saved set.
	    String parentID = it.next(); //iterator will point to parent window.
	    String childId = it.next(); //iterator will point to child ID.
	    
	    driver.switchTo().window(childId); //now driver is on the child window.
	    
	    Thread.sleep(3000);
	    driver.findElementByName("email").sendKeys("abc@gmail.com");
	    driver.findElementByName("pass").sendKeys("abcd");
	    
	    driver.switchTo().window(parentID);
	    System.out.println(driver.getTitle());
	    
	}

}
//set is a data structure. Set only store unique values. It cannot hold dulicate values and it will throw error. 
//getwindowhandle()-->It will return thr window ID of the current page where driver is pointing.
//getWindowhandles()-->it will give the window ID of all the tabs. Means, so not any tab opened previousily.
//We are using set here, because set is the only collection which can store unique values. Windows ID will be unique ID. 
//In set we do not have any index values like in list. 
//First window ID will always the parent window ID.
//We can have n numbers of window opened.
