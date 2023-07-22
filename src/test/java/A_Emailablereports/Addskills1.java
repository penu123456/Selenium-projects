package A_Emailablereports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Addskills1 {
	
	static WebDriver driver;
	
	@BeforeTest
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		
		Reporter.log("passed opening the browser");
	}
  @Test
  public void samp() 
  {
	  
       Addskills1 as=new Addskills1();
	  
	  as.openorangehrm();
	  as.login();
	  as.add_skills();
  }
  public void openorangehrm()
     {
	  
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
		Reporter.log("passed opening url");
     }
   public void login() 
     {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	   Reporter.log("passed login with credentials");
	   
	
     }
   public void add_skills() 
     {
	   driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
	   driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
	   driver.findElement(By.xpath("//a[text()='Skills']")).click();
	   driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	   driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Oracle 18");
	   driver.findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys("Oracle 18 descr");
	   driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	   
	   Reporter.log("passed adding and saving skills");
	
     }
   @AfterTest
   public void closebrowser()
     {
	   
	   driver.close();
	   
	   Reporter.log("passed closing browser");
	   
     }
   

}
