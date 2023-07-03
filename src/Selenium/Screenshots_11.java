package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots_11 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		
		//TakesScreenshot is an interface. So we are coverting driver into takescreenshot. We are giving knowledge to driver about the interface..
		//following line will take screenshot. First typecase, then use method getscreenshot to take screenshot. Then we will gove a knowledge that we need output as a file. Basically, the screenshot take by the methos getsceenshots will be get in file format.
		//Since the output is a file the variable which holding screenshot should also be File. Thats why File src
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Fileutils is a class of selenim and we will be uisng the method of the class
		//Screenshot taken is stored in virtual machine. So we need to copy from there to our local machine by using the following code.
		
		FileUtils.copyFile(src, new File("C://ScreenshotSelenium.png"));
	}
//this won't work bcz there is no other f=driver for me.
}
 

//http://automationpractice.com/index.php
