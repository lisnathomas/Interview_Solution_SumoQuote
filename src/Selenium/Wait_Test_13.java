package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Test_13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//Implicit way:
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
		
		//Explicit way:
		WebDriverWait wait = new  WebDriverWait(driver, 30); //first create object for explicit wait
		
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElementById("draggable")));//util is the method from webdriverwait class. This line will make the execution to stop till we find the element draggable.
		WebElement drag = driver.findElementById("draggable"); //for drag which is source
		WebElement drop = driver.findElementById("droppable");//for drop which is destination
		act.dragAndDrop(drag, drop).build().perform();
	}

}

/*What is synchronization in selenium?
It means waiting. There are three types of wait
1. Implicit wait 2. Explicit wait 3. Fluent wait.
================================================================
Implicit wait is known as global wait. Because we only writing one line. 
Implicit will wait on all the following lines where we are finding webelemnusing driver.findelement.thats why it is global wait
In implicit, if we provide 30 sec wait time and if we find elememt in 15th sec,it wil continue exceution it won't wait till 30 sec to continue.
==============================================================
Exlicit wait is only applicable for a particular line.
It contains expected conditions. 

common ones:
elemtntobeclickable
visibility
precence of elemts//when we create list
==============================================
Fluent wait has polling wait
We need to wait parameter for fluent wait. 
Ex: (30,3) -->these are two parameter -->polling wait is 3sec. driver will check every 3 secs. But if the element is find in 4th sec, we are wasting the time.

*/