package  Day_032_TestNG_Groups;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
public class AllTests
{
	
	
	@Test(groups = { "checkintest" })
	public void AddNationalities() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.close();
	}
	
	
	@Test(groups = { "functest" })
	public void AddJobs() throws Exception {
		
	WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	
	
	@Test(groups = { "functest","GoogleGroup" })
	public void Google() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://www.google.co.in/?gws_rd=ssl");

		//SendKeys
	
		
		//Close Browser		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}                                                  












