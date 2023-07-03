package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextandAttribute2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Important--> //String str = driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on Facebook.')]")).getText();
	    //System.out.println(str); either pass the text to a string or print directly inside print statement.
		
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on Facebook.')]")).getText());
		driver.findElementById("email").sendKeys("123@gmail.com");
		System.out.println(driver.findElementById("email").getAttribute("value"));
		
		System.out.println(driver.findElementByXPath("//button[contains(text(),'')]").getText());
		
		
	}

}


//getText is to get a text. It will always returns string.
//gettext can grab the text. But we won't be able to get the value.'
//getText will get the predefined Text while getAttribute will return value. For eg: user entered email.