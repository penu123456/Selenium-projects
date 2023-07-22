package Day_011_Katalon_Recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddSkills {
	
	WebDriver driver;
	
  @Test
  public void AddSkills() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  
	    
	    driver.findElement(By.xpath("//div[@id='divUsername']/span")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
	    
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_Qualifications")).click();
	    driver.findElement(By.id("menu_admin_viewSkills")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    
	    driver.findElement(By.id("skill_name")).click();
	    driver.findElement(By.id("skill_name")).clear();
	    driver.findElement(By.id("skill_name")).sendKeys("Selenium Automation with Java1");
	    
	    driver.findElement(By.id("skill_description")).click();
	    driver.findElement(By.id("skill_description")).clear();
	    driver.findElement(By.id("skill_description")).sendKeys("sadsd10");
	    
	    driver.findElement(By.id("btnSave")).click();
  }
}
