package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC07_className
{
	static WebDriver driver;

	@Test
	public void Test2() throws Exception {
	
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(TestURL);
		
		Thread.sleep(5000);
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		driver.findElements(By.className("oxd-input oxd-input--active"))
		
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











