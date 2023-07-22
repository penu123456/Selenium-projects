package Day_011_Katalon_Recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Day_034_TestNG_Listeners.TestBrowser;

public class AddJobs {
	WebDriver driver;
	
  @Test
  public void Jobs() throws Exception {
	  
	    driver=TestBrowser.OpenChromeBrowser();
	  
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    

	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div/header/div[2]/nav/ul/li[2]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Job Titles")).click();
	
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div/button")).click();
	    
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[2]/input")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[2]/input")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[2]/input")).clear();
	    
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[2]/input")).sendKeys("Selenium Java1");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).clear();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("adsadsdjp");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
  }
}
