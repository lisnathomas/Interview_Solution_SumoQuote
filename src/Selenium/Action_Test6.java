package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Test6 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.manage().window().maximize();//to maximize window
		//driver.manage().deleteAllCookies(); to delete all cookies if our applicatio needed to.
		
		Actions act = new Actions(driver);
		WebElement we = driver.findElementByXPath("//ul[@class = 'hl-cat-nav__container']/li[3]/a");
		act.moveToElement(we).build().perform();
		
		Thread.sleep(4000);
		driver.findElementByLinkText("Luxury Watches").click();
	}

}

//Actions is a class in selenium. 
//perfrom() is to perfrom our action. Whenever we use action class we need to use build and perform. 
