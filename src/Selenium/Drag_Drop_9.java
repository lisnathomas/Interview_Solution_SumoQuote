package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://jqueryui.com/droppable/");
		driver.navigate().to("https://jqueryui.com/droppable/");//till the time the website loaded, it will not move into next line. Even if the website take time to load the website it will wait till the time the website is loaded.
		
		//driver.switchTo().frame(0);
		//System.out.println(driver.findElementByXPath("//div[@id='draggable']/p").getText());

	//We need actions class to perform drag and drop
		//First switch to frame drag
		
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement drag = driver.findElementById("draggable"); //for drag which is source
		
		WebElement drop = driver.findElementById("droppable");//for drop which is destination
		act.dragAndDrop(drag, drop).build().perform(); //drag and drop is a function of actoins class. This will drar from source to destination.
	
	}

}
