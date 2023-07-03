package Project_TestNG;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login1 {

	WebDriver driver;
		
	@BeforeMethod
	public void CasualWomenCloth() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	
	@DataProvider
	public Iterator<Object[]>  testdata() {
		ArrayList<Object[]> testdata = TestUtilities.getData();
		return testdata.iterator();
		
	}
	
	
	@Test(dataProvider = "testdata")
	public void WomenClothes(String email, String password) throws Throwable {
		
		Actions act = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a"));
		act.moveToElement(women).build().perform();
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Casual Dresses")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Printed Dress")).click();
	    WebElement size = driver.findElement(By.id("group_1"));
		Select sel = new Select(size);
		sel.selectByVisibleText("L");
		driver.findElement(By.id("add_to_cart")).click();
		Thread.sleep(2000);
        driver.findElement(By.linkText("Proceed to checkout")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Proceed to checkout")).click();
        Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		//driver.findElement(By.name("processAddress")).click();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
