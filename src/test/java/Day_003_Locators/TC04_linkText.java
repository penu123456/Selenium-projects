package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class TC04_linkText
{
	static WebDriver driver;
	
	 @Test
	  public void testTC02() throws Exception {
		 
		driver = TestBrowser.OpenChromeBrowser();
			
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //  driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	  //  driver.findElement(By.linkText("Admin")).click(); //<a
	   // driver.findElement(By.linkText("Nationalities")).click();//<a
	    
	  }
	
	
}












