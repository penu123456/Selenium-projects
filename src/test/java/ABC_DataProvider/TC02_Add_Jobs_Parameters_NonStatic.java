package ABC_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC02_Add_Jobs_Parameters_NonStatic {
	
	static WebDriver driver;
	
	

	
	 @DataProvider(name = "TestDataProvider1")
	  public static Object[][] Test1() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Sales12","Sales12 descr","Sales12 Note" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Sales13","Sales13 descr","Sales13 Note" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Sales14","Sales14 descr","Sales14 Note" }

	        	};
	  }
	
	 
	 
	 @DataProvider(name = "TestDataProvider2")
	 public Object[] myDataProvider() {
	      
	     Object data[][]=  new Object[2][6];
	     // First student details
	     data[0][0]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[0][1]= "Admin";
	     data[0][2]= "admin123";
	     data[0][3]= "Sales15";
	     data[0][4]= "Sales15 descr";
	     data[0][5]= "Sales15 Note";
	      
	     // Second student details
	     data[1][0]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[1][1]= "Admin";
	     data[1][2]= "admin123";
	     data[1][3]= "Sales16";
	     data[1][4]= "Sales16 descr";
	     data[1][5]= "Sales16 Note";
	     
	     return data;
	      
	      
	 }
	
	
  @Test(dataProvider="TestDataProvider2")
  public void jobsAddTest(String TestURL,String USerName,
		  String Password,String JobTitle,String JobDescr,String JobNote) throws Exception {
	  
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
