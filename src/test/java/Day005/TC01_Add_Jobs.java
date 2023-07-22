package Day005;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs {
	
	WebDriver driver;
	//Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";//Step2
	String userName="Admin",Password="admin123";//Step2
	String JobTitle="Sales15",JobDescr="Sales15 descr",JobNote="Sales15 Note";//step2
	
	  TC01_Add_Jobs T3=new TC01_Add_Jobs();
	  
  @Test
  public void JobsTest() throws Exception {
	  


	  
	  T3.OpenChromeBrowser();
	  T3.OpenOrangeHRM(TestURL);
	  T3.Login(userName,Password);
	  T3.AddJobs(JobTitle,JobDescr,JobNote);

	    	  
	
	
  }
  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize() ;	
  }
  
  
  
  
  
  public void OpenOrangeHRM(String TestURL) throws Exception {
	  
	  driver.get(TestURL);
	  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
  
  
  
  
  public void Login(String UserName,String Password) throws Exception {
	  
	  findElement(By.name("username")).sendKeys(UserName);
		findElement(By.name("password123")).sendKeys(Password);
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  
	  
  }
  
   
  public void AddJobs(String JobTitle,String JobDescr,String JobNote) throws Exception {
	  
	  findElement(By.xpath("//span[text()='Admin']")).click();
	  

		
		findElement(By.xpath("//span[text()='Job ']")).click();
		findElement(By.xpath("//a[text()='Job Titles']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(JobTitle);
		findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(JobDescr);
		findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(JobNote);
				  
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
