package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC05_partialLinkText
{
	static WebDriver driver;
	
	 @Test
	  public void testTC02() throws Exception {
		 
			driver = TestBrowser.OpenChromeBrowser();
			
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		    Thread.sleep(5000);
		    
		    findElement(By.name("username")).sendKeys("Admin");
		    findElement(By.name("password")).sendKeys("admin123");
		    findElement(By.xpath("//button[@type='submit']")).click();
		    
		    findElement(By.linkText("Admin")).click();
		    findElement(By.partialLinkText("Nation")).click();	
		    
		    
		    
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












