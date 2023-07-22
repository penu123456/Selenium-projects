package Day_022_Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class TC01_Mouse_Hover_Action3 {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	driver=TestBrowser.OpenChromeBrowser();	
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	
	
    WebElement Hello=findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
	WebElement YourOrders=findElement(By.xpath("//span[text()='Your Orders']"));

	Actions actions = new Actions(driver);
	actions.moveToElement(Hello).
	moveToElement(YourOrders).click().build().perform();
		
	}
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
	
	

}
