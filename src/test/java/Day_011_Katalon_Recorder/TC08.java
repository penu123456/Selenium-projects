package Day_011_Katalon_Recorder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class TC08 {
	
static WebDriver driver;
  
  @Test
  public void testUntitledTestCase() throws Exception {
	  
	  driver = TestBrowser.OpenChromeBrowser();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
    driver.get("https://opensource-demo.orangehrmlive.com/");
    
    driver.findElement(By.id("txtUsername")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    
    driver.findElement(By.id("txtPassword")).click();
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    
    driver.findElement(By.id("btnLogin")).click();
    
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.linkText("Logout")).click();
  }

}
