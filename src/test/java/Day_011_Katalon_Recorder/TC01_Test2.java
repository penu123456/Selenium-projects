package  Day_011_Katalon_Recorder;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;


public class TC01_Test2
{
	
	WebDriver driver;
	Reporter1 R1;
	
	 @Test
	  public void testTC02() throws Exception {
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    driver.findElement(By.id("txtUsername")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("frmLogin")).click();
	    driver.findElement(By.id("frmLogin")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	  }
	
	
	@Test
	public void TC01_Report_Test() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	   
	  findElement(By.id("txtPassword")).click();
	   findElement(By.id("txtPassword")).clear();
	    findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    
	    findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_nationality")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    
	   findElement(By.id("nationality_name")).click();
	    driver.findElement(By.id("nationality_name")).clear();
	    driver.findElement(By.id("nationality_name")).sendKeys("Indian1239");
	    
	   findElement(By.id("btnSave")).click();
		
	
	}
	
	
	

	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		// draw a border around the found element
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
			
		
	
	
	
	
	
	
	
	
	
	
	
	

}












