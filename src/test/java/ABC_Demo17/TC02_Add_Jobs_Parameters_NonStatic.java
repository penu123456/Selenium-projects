package ABC_Demo17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02_Add_Jobs_Parameters_NonStatic {
	
	static WebDriver driver;
	
	//Step1 - Global variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String USerName="Admin",Password="admin123";
	String JobTitle="Sales12",JobDescr="Sales12 descr",JobNote="Sales12 Note";
	

	
  @Test
  public void jobsAddTest() throws Exception {
	  
	  TC02_Add_Jobs_Parameters_NonStatic T1=new  TC02_Add_Jobs_Parameters_NonStatic();
	  
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM(TestURL);
	  T1.Login(USerName,Password);
	  T1.AddJobs(JobTitle,JobDescr,JobNote);
		
  }
  
  
  
  
  public  void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }
  
  
 public  void OpenOrangeHRM(String TestURL) throws Exception {
	 
		driver.get(TestURL);
  }
  
  
 public  void Login(String USerName,String Password) throws Exception {
	 
		findElement(By.name("txtUsername")).sendKeys(USerName);
		findElement(By.name("txtPassword")).sendKeys(Password);
		findElement(By.id("btnLogin")).click();
 }
 
  
 public   void AddJobs(String JobTitle1,String JobDescr1,String JobNote1) throws Exception {
	  
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Job")).click();
		findElement(By.id("menu_admin_viewJobTitleList")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle1);
		findElement(By.id("jobTitle_jobDescription")).sendKeys(JobDescr1);
		findElement(By.id("jobTitle_note")).sendKeys(JobNote1);
		findElement(By.id("btnSave")).click();
 }
 
  
  
  
  public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", elem);
	 
		}
		return elem;
	}

  
  
}
