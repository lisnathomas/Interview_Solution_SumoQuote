package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts_10 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		//popups are written in javascript
		
		
		//First find the element which give pop up. Then clisk to get the alert
		driver.findElementByName("B1").click();
		
		Thread.sleep(1000);
		
		//secondly switch into popup. Alert is an interface of selenium.
		Alert ai = driver.switchTo().alert();
		ai.accept(); //to accept alert, we can use .cancel to cancel alert. 
		

	}

}
