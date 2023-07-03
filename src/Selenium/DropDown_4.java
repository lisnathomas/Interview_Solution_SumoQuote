package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_4 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElementByLinkText("Create new account").click();
	    Thread.sleep(1000);
	    
	    WebElement unm = driver.findElementByXPath("//select[@id='month']");
	    Select month = new Select(unm); //select is the class for drop down
	    month.selectByIndex(3);
	    Select day = new Select(driver.findElementByXPath("//select[@id='day']"));
	    day.selectByValue("4");
	    Select year = new Select(driver.findElementByXPath("//select[@id='year']"));
	    year.selectByVisibleText("1998");
	}

}

//by passing argument to select class we are having the concept of constructor. When we create an object for a class constructor will initialize automatically. Here we created ojject for select class and we initialized contructor with parametre.
//tag will always "select" for drop down.
//xpath will always start with select.
//select class is an inbuilt class in selenium used for drop down
//three properties for select. 1. using index, then uing value, then using directly value
//mostly used  is visible text. Because we know the value. We will directly passing the value.