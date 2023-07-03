package SeleniumPractices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Feb2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://gaminglabs.com/");
		
		//System.out.println("Sucees");
		//driver.close();
		
		/*driver.manage().window().maximize();
		WebElement a = driver.findElementByLinkText("New to GLI");
		Actions act = new Actions(driver);
		
		act.moveToElement(a).build().perform();
		driver.findElementByLinkText("A New Machine").click();
		
*/
	driver.manage().window().maximize();
	driver.findElementByLinkText("Login").click();
	Thread.sleep(5000);
	//System.out.println(driver.getTitle());
	
	Set<String> win = driver.getWindowHandles();
	Iterator<String> it = win.iterator();
	String pid =it.next();
	String cid = it.next();
	
	driver.switchTo().window(cid);
	
	
	//driver.findElementById("Username").sendKeys("dfg");
	driver.findElementByLinkText("New User Request Form").click();
	//driver.findElementByXPath("//div[@class ='col-sm-5 login']/div/div[3]/a[1]").click();
	//driver.findElementByName("firstname").sendKeys("ddd");
	
	WebElement unm = driver.findElementByName("industry_division");
	Select sel = new Select(unm);
	sel.selectByVisibleText("Supplier");
	
	
	
	
	
	
	
	}

}
