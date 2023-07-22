package  Day_014_ParallelMethods;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
public class OrangeHRMTest3
{
	WebDriver driver;
	
	
	
	
	@Test
	public void TC01_Test3() throws Exception {
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='button']")).click();
	
	}
	
	@Test(dependsOnMethods = { "TC01_Test1" })
	public void TC02_Test2() throws Exception {
		
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("Nationalities")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		
		
		
		
	}
	
	
}                                                  












