package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayXpath_practice2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pages.ebay.ca/sitemap.html");
		
		//driver.findElementByLinkText("register").click();
		driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
		Thread.sleep(1000);
		driver.findElementByXPath("//form[@name='create-personal-account-with-email']/div[1]/span/span[1]/span/input").click();
		driver.findElementByXPath("//form[@name='create-personal-account-with-email']/div[1]/span/span[1]/span/input").sendKeys("Lisna");
		
		driver.findElementByXPath("//form[@name='create-personal-account-with-email']/div[2]/span/span[1]/span/input").click();
		driver.findElementByXPath("//form[@name='create-personal-account-with-email']/div[2]/span/span[1]/span/input").sendKeys("Thomas");
		
		driver.findElementByXPath("//div[@id='search-container']/span[1]/span[1]/span/input").click();
		driver.findElementByXPath("//div[@id='search-container']/span[1]/span[1]/span/input").sendKeys("ab@gmail.com");

		driver.findElementByXPath("//form[@name='create-personal-account-with-email']/div[4]/span/span[1]/span/input").click();
		driver.findElementByXPath("//form[@name='create-personal-account-with-email']/div[4]/span/span[1]/span/input").sendKeys("1@abcdefghijklmnop");
	}

}
