package SeleniumPractices;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practocesSample {

	public static void main(String[] args) throws Throwable {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		List <WebElement> all = driver.findElementsByTagName("a");
		
		for (int i=0;i<=all.size();i++) {
			
			System.out.println(all.get(i).getText());
		}
		
		//driver.findElementById("email").sendKeys("dddd");
		//driver.findElementByName("pass").sendKeys("dd");;
		//System.out.println(driver.findElementByName("login").ge);
		
		//driver.findElementByLinkText("Create new account").click();
		//Thread.sleep(2000);
		
		//driver.findElementByXPath("//span[@data-name ='gender_wrapper']/span[1]/input").click();
		
		//WebElement unm = driver.findElementById("month");
		//Select  bdy = new Select(unm);
		//bdy.selectByVisibleText("Mar");
		

	}

}
