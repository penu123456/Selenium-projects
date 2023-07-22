package  Day_008_Emailable_Report;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestExample2_Browser
{
	
static WebDriver driver;
	
	@Parameters({"Browser"})
	@BeforeTest
	public void Test1(String Browser) throws Exception 
	{
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver = TestBrowser.OpenChromeBrowser();
	    }

		if(Browser.equalsIgnoreCase("FireFox"))
		{
			driver = TestBrowser.FirefoxBrowser();
		}
		
		
	}
	
	
	
	@Test
	public void Test2() throws Exception {
		
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		Thread.sleep(3000);
		
	    Reporter.log("Pass- open Orangehrm");
	    
		driver.findElement(By.name("username")).sendKeys("Admin");
		Reporter.log("Pass- Enter User Name");
		
		driver.findElement(By.name("password")).sendKeys("admin123");	
		Reporter.log("Pass- Enter Password");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Reporter.log("Pass- Click on Signin");
	
	}
	
	
	
	
	@AfterTest
	public void Test3() throws Exception {
		
		driver.close();
	}
	
	
	
	
	

}












