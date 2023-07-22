package Day004;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs {
	
	WebDriver driver;
	
  @Test
  public void JobsTest() throws Exception {
	  

	  TC01_Add_Jobs T1=new TC01_Add_Jobs();
	  
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM();
	  T1.Login();
	  T1.AddJobs();

	    	  
	
	
  }
  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize() ;	
  }
  
  
  
  
  
  public void OpenOrangeHRM() throws Exception {
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
  
  
  
  
  public void Login() throws Exception {
	  
	  findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  
	  
  }
  
   
  public void AddJobs() throws Exception {
	  
	  findElement(By.xpath("//span[text()='Admin']")).click();
	  

		
		findElement(By.xpath("//span[text()='Job ']")).click();
		findElement(By.xpath("//a[text()='Job Titles']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Sales3");
		findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys("Sales3 descr");
		findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys("Sales3 Note");
				  
		Thread.sleep(5000);
		findElement(By.xpath("//button[text()=' Save ']")).click();
		  
	  
  }
  
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}

  
  
  
  
  
  
  
  
  
  
}
