package A_Emailablereports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Addskills {
	
	WebDriver driver;
  @Test
  public void samp()
  {
	  
	  Addskills as=new Addskills();
	  
	  
	  as.openchrome();
	  as.openorangehrm();
	  as.login();
	  as.add_skills();
	  as.closebrowser();
  }
  public void openchrome()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		
		Reporter.log("passed opening browser");
  }
  public void openorangehrm()
  {
	  
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Reporter.log("Passed opening url");
		
  }
   public void login()
   {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	    Reporter.log("passed login test");
	    
   }
   public void add_skills() 
   {
	   driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
	   driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
	   driver.findElement(By.xpath("//a[text()='Skills']")).click();
	   driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	   driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Oracle 88");
	   driver.findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys("Oracle 88 descr");
	   driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	   
	  Reporter.log("passed adding and saving skills");
	   
		
   }
   public void closebrowser()
   {
	  driver.close(); 
	  
	  Reporter.log("passed closing browser");
   }
   
  
}
