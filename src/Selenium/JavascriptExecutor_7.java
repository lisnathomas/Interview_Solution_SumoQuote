package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutor_7 {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.adidas.ca/en?cm_mmc=AdieAffiliates_IR-_-Sovrn%20Commerce-_-adidas%20Canada%20-%20Homepage-_-TEXT_LINK-_-&irclickid=1-U0Wj0gHxyNW6vUlT2qd0LUUkD1rOzx3wEFyE0&irgwc=1");
		
		
		//
		
		//Typecasting
		//option 1 - using  and Y attributes
		JavascriptExecutor jse = (JavascriptExecutor)driver; //converting driver to interface using type casting.
		//jse.executeScript("window.scrollBy(0,5000)");
		//driver.findElementByLinkText("Careers").click();
		
		//Option 2 - create webelement
		WebElement career = driver.findElementByLinkText("Careers");
		jse.executeScript("arguments[0].click()", career);
		
		
	}

}

//ElementClickInterceptedException
//javascriptexecutor is an interface. We can't create an object. So we will convert driver into interface using type casting
