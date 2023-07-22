package ABC_Data_Hai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs_NonStatic_Parameters {
	
	WebDriver driver;
	
	//Step2 - Declaration of Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",PassWord="admin123";
	String JobTitle="Sales11",JobDescr="Sales11 descr",JobNote="Sales11 Note";
	
	
  @Test
  public void JobsTest() throws Exception {
	  
	
	  TC01_Add_jobs_NonStatic_Parameters T1=new TC01_Add_jobs_NonStatic_Parameters();
	  T1.openBrowser();
	  T1.OpenOrangeHRM(TestURL); //step 3- Passing Global Variables 
	  T1.Login(UserName,PassWord);//step 3- Passing Global Variables 
	  T1.AddJobs(JobTitle,JobDescr,JobNote);//step 3- Passing Global Variables 
		
		
  }
  
  
  public void openBrowser() throws Exception
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			driver.manage().window().maximize() ;	
	  
  }
  
  public void OpenOrangeHRM(String TestURL) throws Exception
  {
		//driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.get(TestURL);
  }
  
  public void Login(String UserName,String PassWord) throws Exception
  {
	//Login
			driver.findElement(By.name("username")).sendKeys(UserName);
			driver.findElement(By.name("password")).sendKeys(PassWord);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
  }
  
  public void AddJobs(String JobTitle,String JobDescr,String JobNote) throws Exception
  {
	//AddJobs
			driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
			driver.findElement(By.xpath("//span[text()='Job ']")).click();
			driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(JobTitle);
			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(JobDescr);
			driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(JobNote);
			driver.findElement(By.xpath("//button[text()=' Save ']")).click();
			
  }
  
  
  
  
}
