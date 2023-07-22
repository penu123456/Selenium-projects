package  Day_014_ParallelMethods;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
public class OrangeHRMTest2
{
	WebDriver driver;
	
	
	
	
	@Test
	public void TC01_Test1() throws Exception {
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='button']")).click();

	
	}
	
	
	
	
}                                                  












