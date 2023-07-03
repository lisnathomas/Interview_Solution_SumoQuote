package Selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_alllinks5 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		/*List<WebElement> allLinks = driver.findElementsByTagName("a");
		System.out.println("Size is" +allLinks.size());
		
		for(int i=0;i<allLinks.size();i++) {
			
			System.out.println(allLinks.get(i).getText());
		}
		
		*/
		
		//driver.findElementByXPath("//div[@id=\"nav-main\"]");
		//driver.findElementByXPath("div[@id='nav-main'");
		
		List<WebElement> Links = driver.findElementsByXPath("//div[@id='nav-xshop']/a");
		System.out.println("Size is" +"  " +Links.size());
		
		for(int a=0;a<Links.size();a++) {
			
			System.out.println(Links.get(a).getText());
		}
        Thread.sleep(1000);
		Links.get(2).click();
	}

}

//This will print number of link located on this Amazon page. 
//Webelements are stored on array. It can access through FIFO. You can store duplicate values 
//Java has a concept of Collection to . List, set, value.
//In array we want to define particular size. In list we do not eant to define size, ijava will automatically calculate the size at runtime and allocate memory.  
