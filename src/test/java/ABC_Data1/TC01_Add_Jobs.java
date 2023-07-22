package ABC_Data1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs {
	
	WebDriver driver;
	
  @Test
  public void JobsTest() {
	  
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	
	driver.findElement(By.id("menu_admin_viewAdminModule12")).click();
	driver.findElement(By.id("menu_admin_Job")).click();
	driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales4");
	driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales4 descr");
	driver.findElement(By.id("jobTitle_note")).sendKeys("Sales4 Note");
	driver.findElement(By.id("btnSave")).click();
	
	
	
  }
  
  
}
