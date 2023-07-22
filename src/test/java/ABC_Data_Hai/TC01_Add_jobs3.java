package ABC_Data_Hai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs3 {
	
	static WebDriver driver;
	
  @Test
  public static  void JobsTest() throws Exception {
	  
	  TC01_Add_jobs3.openBrowser();
	  TC01_Add_jobs3.OpenOrangeHRM();
	  TC01_Add_jobs3.Login();
	  TC01_Add_jobs3.AddJobs();
		
		
  }
  
  
  public static void openBrowser() throws Exception
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			driver.manage().window().maximize() ;	
	  
  }
  
  public static void OpenOrangeHRM() throws Exception
  {
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  public static void Login() throws Exception
  {
	//Login
			findElement(By.name("username")).sendKeys("Admin");
			findElement(By.name("password")).sendKeys("admin123");
			findElement(By.xpath("//button[@type='submit']")).click();
			
  }
  
  public static void AddJobs() throws Exception
  {
	//AddJobs
			findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
			findElement(By.xpath("//span[text()='Job ']")).click();
			findElement(By.xpath("//a[text()='Job Titles']")).click();
			findElement(By.xpath("(//button[@type='button'])[2]")).click();
			findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Sales8");
			findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("Sales8 descr");
			findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys("Sales8 Note");
			findElement(By.xpath("//button[text()=' Save ']")).click();
			
  }
  
  

  
  public static WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	} 
  
  
  
  
}
