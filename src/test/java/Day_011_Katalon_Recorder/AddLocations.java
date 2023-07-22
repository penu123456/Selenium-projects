package Day_011_Katalon_Recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Day_034_TestNG_Listeners.TestBrowser;

public class AddLocations {
	WebDriver driver;
  @Test
  public void Locations() throws Exception {
	  
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
	    
	 
	    driver.findElement(By.xpath("//div[@id='app']/div/div/aside/nav/div[2]/ul/li/a/span")).click();
	    
	    driver.findElement(By.xpath("//div[@id='app']/div/div/header/div[2]/nav/ul/li[3]/span")).click();
	    driver.findElement(By.linkText("Locations")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div/div/button")).click();
	    
	    
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div/div")).click();
	    
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div/div/div[2]/input")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div/div/div[2]/input")).clear();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div/div/div[2]/input")).sendKeys("asdasd");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span/i")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  
	  
  }
}
