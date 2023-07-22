package ABC_ABC1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs_Static_Parameters {
	
	static WebDriver driver;
	
	
	//Step1 Global variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",PassWord="admin123";
	String JobTitle="Sales11",JobDescr="Sales11 descr",JobNote="Sales11 Note";

	
	
  @Test
  public void JobsTest() throws Exception {
	  
	    
	  
	  
	  TC01_Add_Jobs_Static_Parameters.OpenChromeBrowser();
	  TC01_Add_Jobs_Static_Parameters.OpenOrangeHRM(TestURL);//Step2  - Passing Global variables to Main Methods
	  TC01_Add_Jobs_Static_Parameters.Login(UserName,PassWord);//Step2
	  TC01_Add_Jobs_Static_Parameters.Add_jobs(JobTitle,JobDescr,JobNote);//Step2
		
	
  }
  
  
  
  
  public static void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize() ;	
	  
	  
  }
  
  
  public static void OpenOrangeHRM(String TestURL1) throws Exception {
	  
		driver.get(TestURL1);
  }
  
  
  public static void Login(String UserName1,String PassWord1) throws Exception {
	  
		findElement(By.xpath("//input[@name='username']")).sendKeys(UserName1);
		findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PassWord1);
		findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  
  public static void Add_jobs(String JobTitle1,String JobDescr1,String JobNote1) throws Exception {
	  
	  	Thread.sleep(5000); 
		
		findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
		findElement(By.xpath("//span[text()='Job ']")).click(); //Jobs
		findElement(By.xpath("//a[text()='Job Titles']")).click(); //Job Titles
		
		Thread.sleep(5000); 
		findElement(By.xpath("(//button[@type='button'])[2]")).click(); //Add button
		
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(JobTitle1);
		findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(JobDescr1);
		findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(JobNote1);
		
		
		Thread.sleep(5000); //execution will be passed for 5 seconds
			
		driver.findElement(By.xpath("//button[@type='submit']")).click();  //Save
	  
	  
	  
  }
  
  
  
  
  
  // to highlight web element border during execution time
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
