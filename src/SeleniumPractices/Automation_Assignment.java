package SeleniumPractices;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Assignment {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		Actions act = new Actions(driver);
		WebElement women = driver.findElementByXPath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a");
		act.moveToElement(women).build().perform();
		

		driver.findElementByLinkText("Casual Dresses").click();
		
		Thread.sleep(2000);
		driver.findElementByLinkText("Printed Dress").click();
		
		WebElement size = driver.findElementById("group_1");
		Select sel = new Select(size);
		sel.selectByVisibleText("L");
		
		String price1 = driver.findElementById("our_price_display").getText();
		System.out.println("Price in first page:" +"" +price1);
		
		driver.findElementById("add_to_cart").click();
		
		Thread.sleep(3000);
		String price2 = driver.findElementById("layer_cart_product_price").getText();
		System.out.println("Price in second page is:" +"" +price2);
		
		if (price1.equals(price2)) {
			System.out.println("Prices are matching.");
		}else 
			System.out.println("Prices are not matching.");
		
		Thread.sleep(1000);
		driver.findElementByLinkText("Proceed to checkout").click();
		
		driver.findElementByLinkText("Proceed to checkout").click();
	/*	
		driver.findElementById("email_create").sendKeys("asdfvcxz@gmail.com");
		driver.findElementById("SubmitCreate").click();
		
		Thread.sleep(2000);
		driver.findElementById("id_gender2").click();
		driver.findElementByName("customer_firstname").sendKeys("Esther");
		driver.findElementByName("customer_lastname").sendKeys("Jacob");
		driver.findElementByName("passwd").sendKeys("qwerty");
		
		WebElement date = driver.findElementById("days");
		Select day = new Select(date);
		day.selectByValue("9");
		Select month = new Select(driver.findElementByName("months"));
		month.selectByVisibleText("February ");
		Select year = new Select(driver.findElementByName("years"));
		year.selectByValue("2001");
		
		driver.findElementByName("newsletter").click();
		driver.findElementById("uniform-optin").click();
		
		driver.findElementById("company").sendKeys("ABCD");
		driver.findElementById("address1").sendKeys("345, Yale Rd");
		driver.findElementById("address2").sendKeys("Highstreet");
		driver.findElementById("city").sendKeys("Vancouver");
		driver.findElementById("postcode").sendKeys("12345");
		
		Select province = new Select(driver.findElementByName("id_state"));
		province.selectByVisibleText("California");
		
		driver.findElementById("other").sendKeys("abcdefghijkl");
		driver.findElementById("phone").sendKeys("512633333333");
		driver.findElementById("phone_mobile").sendKeys("458961254544");
		//driver.findElementById("alias").sendKeys("Surrey");
		driver.findElementById("submitAccount").click(); */
//====================================================================================completed account creation.
		
		driver.findElementById("email").sendKeys("asdfvcxz@gmail.com");
		driver.findElementById("passwd").sendKeys("qwerty");
		driver.findElementById("SubmitLogin").click();
		driver.findElementByName("processAddress").click();
		
		driver.findElementByName("cgv").click();
		driver.findElementByName("processCarrier").click();
		
		System.out.println(driver.findElementById("total_price").getText());
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("d://ScreenshotSelenium.png"));
		
	}
}
