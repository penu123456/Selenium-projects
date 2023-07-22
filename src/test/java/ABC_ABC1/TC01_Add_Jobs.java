package ABC_ABC1;

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
	  
	    
	  TC01_Add_Jobs T2=new TC01_Add_Jobs();
	  
		T2.OpenChromeBrowser();
		T2.OpenOrangeHRM();
		T2.Login();
		T2.Add_jobs();
		
	
  }
  
  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize() ;	
	  
	  
  }
  
  
  public  void OpenOrangeHRM() throws Exception {
	  
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  
  public void Login() throws Exception {
	  
		findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  
  public void Add_jobs() throws Exception {
	  
	  	Thread.sleep(5000); 
		
		findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
		findElement(By.xpath("//span[text()='Job ']")).click(); //Jobs
		findElement(By.xpath("//a[text()='Job Titles']")).click(); //Job Titles
		
		Thread.sleep(5000); 
		findElement(By.xpath("(//button[@type='button'])[2]")).click(); //Add button
		
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Sales8");
		findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("Sales8 descr");
		findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys("Sales8 Note");
		
		
		Thread.sleep(5000); //execution will be passed for 5 seconds
			
		driver.findElement(By.xpath("//button[@type='submit']")).click();  //Save
	  
	  
	  
  }
  
  
  
  
  
  // to highlight web element border during execution time
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
