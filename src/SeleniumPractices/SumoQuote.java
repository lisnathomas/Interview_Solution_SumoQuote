package SeleniumPractices;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SumoQuote {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisna\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sumoquoteweb-qa.azurewebsites.net/new-account");
		
		driver.manage().window().maximize();
		
		//Creating account in SumoQuote Website. 
		/*
		driver.findElementById("accountName").sendKeys("SumoQuote");
		driver.findElementById("firstName").sendKeys("Lisna");
		driver.findElementById("lastName").sendKeys("Thomas");
		driver.findElementById("emailAddress").sendKeys("lisnalaigy@gmail.com");
		driver.findElementById("phoneNumber").sendKeys("6048077228");
		driver.findElementById("Password").sendKeys("Abcd123!");
		driver.findElementById("repeatPassword").sendKeys("Abcd123!");
		driver.findElementById("howHeard").sendKeys("Other");
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='v-input--selection-controls__ripple']").click();
		driver.findElementByXPath("//button[@class='btn-sumo-primary v-btn v-btn--has-bg theme--light elevation-0 v-size--default']/span").click();
		*/
		
		//Login page
		driver.findElementByLinkText("LOG IN!").click();
		Thread.sleep(5000);
		driver.findElementByName("email").sendKeys("lisnalaigy@gmail.com");
		driver.findElementByName("password").sendKeys("Abcd123!");
		driver.findElementByXPath("//button[@class='auth0-lock-submit']/span").click();
		Thread.sleep(5000);
		
		//To click on the "Get Started" button
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		WebElement web = driver.findElementByXPath("//div[@class='text-center pt-0 col col-12']/button/span");
		jse.executeScript("arguments[0].click()", web);
		Thread.sleep(4000);
		
		//To populate fields in "Title Page Content"
		driver.findElementById("capabilities").sendKeys("Roofing");
		driver.findElementById("capabilities2").sendKeys("Resedential");
		WebElement web2 = driver.findElementByXPath("//div[@class='text-center pt-0 col col-12']/button");
		jse.executeScript("arguments[0].click()", web2);
		Thread.sleep(4000);
		
		//Branding style selection
		WebElement web3 = driver.findElementByXPath("//div[@class='text-center pt-0 col col-12']/button/span");
		jse.executeScript("arguments[0].click()", web3);
		Thread.sleep(3000);
		
		//Selection of type of work	
		driver.findElementByXPath("//div[@class='v-responsive__content']").click();
		Thread.sleep(3000);
		WebElement web4 = driver.findElementByXPath("//div[@class='v-responsive__content']");
		jse.executeScript("arguments[0].click()", web4);
		driver.findElementByXPath("//div[@class='v-card__actions']/button/span").click();
		Thread.sleep(2000);
		WebElement web5 = driver.findElementByXPath("//div[@class='text-center pt-0 col col-12']/button");
		jse.executeScript("arguments[0].click()", web5);
		
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@class='btn btn-sumo-primary v-btn v-btn--has-bg theme--light elevation-0 v-size--default']/span").click();
	    
	}
}
