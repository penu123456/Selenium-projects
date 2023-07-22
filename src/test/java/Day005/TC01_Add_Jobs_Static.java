package Day005;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs_Static {
	
	static WebDriver driver;
	//Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";//Step2
	String userName="Admin",Password="admin123";//Step2
	String JobTitle="Sales15",JobDescr="Sales15 descr",JobNote="Sales15 Note";//step2
	
	
  @Test
  public void JobsTest() throws Exception {
	  
	  TC01_Add_Jobs_Static.OpenChromeBrowser();
	  TC01_Add_Jobs_Static.OpenOrangeHRM(TestURL);
	  TC01_Add_Jobs_Static.Login(userName, Password);
	  TC01_Add_Jobs_Static.AddJobs(JobTitle, JobDescr, JobNote);
	  
  }
  
  
  
  public static void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize() ;	
  }
  
  
  
  
  
  public static void OpenOrangeHRM(String TestURL) throws Exception {
	  
	  driver.get(TestURL);
	  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
  
  
  
  
  public static void Login(String UserName,String Password) throws Exception {
	  
	  findElement(By.name("username")).sendKeys(UserName);
		findElement(By.name("password")).sendKeys(Password);
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  
	  
  }
  
   
  public static void AddJobs(String JobTitle,String JobDescr,String JobNote) throws Exception {
	  
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
  
  
  public static  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}

  
  
  
  
  
  
  
  
  
  
}
