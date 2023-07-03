package SeleniumPractices;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NikePractice {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nike.com/ca/t/dunk-high-up-shoes-DKdvP1/DH3718-108");
		
		/*
		Actions act = new Actions(driver);
		WebElement mov = driver.findElementByXPath("//ul[@class='pre-desktop-menu']/li[3]/a");
		act.moveToElement(mov).build().perform();
		
		Thread.sleep(1000);
		//JavascriptExecutor shoes = (JavascriptExecutor)driver;
		driver.findElementByLinkText("Basketball").click();
		//shoes.executeScript("arguments[0].click", web1);
		
		Thread.sleep(6000);
		
		JavascriptExecutor shoes = (JavascriptExecutor)driver;
		//WebElement web = driver.findElementByXPath("//div[@class='product-grid css-1hl0l1w']/main/section/div/div[3]/div/figure/a[2]");
		//WebElement web = driver.findElementByXPath("//div[@class='product-grid css-pz797i']/main/section/div/div[3]/div/figure/a[2]");
		WebElement web = driver.findElementByLinkText("Kyrie Infinity By You");
		shoes.executeScript("arguments[0].click()", web);
		*/
		
		driver.findElementByXPath("//div[@id='floating-atc-wrapper' ]/div/button[1]").click();
		
		//div[@id='nav-cart']/a/div/span

	
	}

}
