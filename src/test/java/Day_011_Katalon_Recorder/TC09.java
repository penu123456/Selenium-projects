package Day_011_Katalon_Recorder;

import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC09 {
	
	WebDriver driver;
	
	@Test
	  public void testUntitledTestCase() throws Exception {
		
		  driver = TestBrowser.OpenChromeBrowser();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    //driver.findElement(By.xpath("//div[@id='divUsername']/span")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
	    
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_Organization")).click();
	    driver.findElement(By.id("menu_admin_viewLocations")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.id("location_name")).click();
	    driver.findElement(By.id("location_name")).clear();
	    driver.findElement(By.id("location_name")).sendKeys("TCS1");
	    
	    driver.findElement(By.id("location_country")).click();
	    new Select(driver.findElement(By.id("location_country"))).selectByVisibleText("India");
	    
	    driver.findElement(By.id("location_notes")).click();
	    driver.findElement(By.id("location_notes")).clear();
	    driver.findElement(By.id("location_notes")).sendKeys("qweqwe");
	    
	    driver.findElement(By.id("btnSave")).click();
	  }

}
