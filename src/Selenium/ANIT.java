package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ANIT {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		
		/* driver.findElementById("email").sendKeys("dsfdsfsd");
		driver.findElementByName("pass").sendKeys("dfvdf");
		driver.findElementByName("login").click(); 
		
		driver.findElementByLinkText("Forgot password?").click();
		driver.findElementByXPath("//div[@class='_6lux']/input[1]").sendKeys("df"); */
		
		driver.findElementByLinkText("Create new account").click();
		Thread.sleep(3000);
		driver.findElementByName("firstname").sendKeys("Henna");
		driver.findElementByXPath("//span[@class='_5k_2 _5dba']/input[1]").click();
		
		WebElement unm = driver.findElementByName("birthday_month");
		Select oj = new Select(unm);
		oj.selectByVisibleText("Jan");
}
}
