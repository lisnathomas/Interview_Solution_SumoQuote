package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html\r\n");
			
		//Option 1 - using the index value of frame. 
		//driver.switchTo().frame(1); //This frame is located on index 1. If it was the right frame it is index 2. So try change value. 
		
		//option 2 for swithch 2 - use id or name of the frame. easy one.
		driver.switchTo().frame("left");
		
		//driver.switchTo().parentFrame()//if we want to go back to parent frame from nested frame.
		//driver.switchTo().defaultContent()//if we want to go back to main cintent
		
		System.out.println(driver.findElementById("left0").getText());
	}

}

//If an elementt is inside frame we need to use switch to to find the frame first.
//If we have nested frame and if we need to find an element inside nest frame. Fist we need to go main frame first then go to child frame, then we will inspect webelemnt.
//Once we enter into nested frame, if we want to go back to parant frame use parentframe/
//If we wnat to go to main contenet default ocntent
