package ABC_Demo17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02_Add_Jobs {
	
	static WebDriver driver;
	
  @Test
  public void jobsAddTest() throws Exception {
	  
	  TC02_Add_Jobs.OpenChromeBrowser();
	  TC02_Add_Jobs.OpenOrangeHRM();
	  TC02_Add_Jobs.Login();
	  TC02_Add_Jobs.AddJobs();
		
  }
  
  
  
  
  public static void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }
  
  
 public static void OpenOrangeHRM() throws Exception {
	 
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  
 public static void Login() throws Exception {
	 
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
 }
 
  
 public static  void AddJobs() throws Exception {
	  
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Job")).click();
		findElement(By.id("menu_admin_viewJobTitleList")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales4");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales4 descr");
		findElement(By.id("jobTitle_note")).sendKeys("Sales4 Note");
		findElement(By.id("btnSave")).click();
 }
 
  
  
  
  public static  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", elem);
	 
		}
		return elem;
	}

  
  
}
