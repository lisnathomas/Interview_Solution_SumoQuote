package Selenium;


import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class BasicAutomation_1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rbcroyalbank.com/personal.html");
		
		/*
		driver.findElementById("email").sendKeys("hello980@gmail.com");
		driver.findElementByName("pass").sendKeys("password");
		//driver.findElementByName("login").click();
	   
		driver.findElementByLinkText("Create new account").click();
	    Thread.sleep(1000);
		driver.findElementByName("firstname").sendKeys("Henna");
		driver.findElementByName("lastname").sendKeys("Elsa");
		driver.findElementByName("reg_email__").sendKeys("ASDFGH@gmail.com");
		driver.findElementByXPath("//div[@id='password_field']/div/div/input").sendKeys("abcdefghijklmnop");
		
		*/
		Thread.sleep(2000);
		driver.findElementByLinkText("Sign In").click();
		Thread.sleep(6000);
		driver.findElementById("userName").sendKeys("dffdff");
		driver.findElementById("signinNext").click();
		Thread.sleep(6000);
		driver.findElementById("password").sendKeys("dddd");
		driver.findElementById("signinNext").click();
		
		Thread.sleep(6000);
		
		String actual = driver.findElementByXPath("//h6[@class='alertHeading']").getText();
		System.out.println(actual);
		String expected = "We’re expecting a different answer.\n Please try again.";
		System.out.println("Assertion succesfull");
				
		
		
		
		
		
		
	}

}

//Things to remember
//1. Xpath - Relative and absolute xpath
//2.Absolute xpath will travel from the root node to the desired tag. No longer used. It can make confusions as well as erros. Start with /
//3. Relative can directly use from desired tag. Start with //

//4. Selenuim excutes very fastly. But browser will take time. So we need to stop the exceution when browser is loading so we use thread. Thread will ha;p Java to halt the execution.

//IOExceptions:
//1. NosuchElement Exception - this case we can use thread. Mainly because selenium exceites fastly and will try to get webelement. But at that time browser will be atill loading. So it wouldn't find element.
//2. 
