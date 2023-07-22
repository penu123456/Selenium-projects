package ABC_Data_Hai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs2 {
	
	WebDriver driver;
	
  @Test
  public void JobsTest() throws Exception {
	  
	
	  TC01_Add_jobs2 T1=new TC01_Add_jobs2();
	  T1.openBrowser();
	  T1.OpenOrangeHRM();
	  T1.Login();
	  T1.AddJobs();
		
		
  }
  
  
  public void openBrowser() throws Exception
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			driver.manage().window().maximize() ;	
	  
  }
  
  public void OpenOrangeHRM() throws Exception
  {
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  public void Login() throws Exception
  {
	//Login
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
  }
  
  public void AddJobs() throws Exception
  {
	//AddJobs
			driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
			driver.findElement(By.xpath("//span[text()='Job ']")).click();
			driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Sales4");
			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("Sales4 descr");
			driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys("Sales4 Note");
			driver.findElement(By.xpath("//button[text()=' Save ']")).click();
			
  }
  
  
  
  
}
