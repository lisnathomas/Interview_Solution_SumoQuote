package SeleniumPractices;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Messenger_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lisna\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElementByLinkText("Messenger").click();
		Thread.sleep(3000);
		driver.findElementById("email").click();
		driver.findElementById("email").sendKeys("hello980@gmail.com");
		
		driver.findElementById("pass").sendKeys("password");
		Thread.sleep(3000);
		driver.findElementById("loginbutton").click();
	}

}
