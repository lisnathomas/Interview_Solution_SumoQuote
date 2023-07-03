package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElementByLinkText("Create new account").click();
	    Thread.sleep(1000);
	    //driver.findElementByXPath("//span[@data-name='gender_wrapper']/span[1]/label").click(); //for female radio button
	    //driver.findElementByXPath("//span[@data-name='gender_wrapper']/span[2]/label").click();//for male radio button
	    driver.findElementByXPath("//span[@data-name='gender_wrapper']/span[3]/label").click();//for custom

	}

}
