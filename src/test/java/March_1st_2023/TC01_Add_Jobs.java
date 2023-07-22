package March_1st_2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC01_Add_Jobs {
	
	WebDriver driver;
	
	//Parameterization
	
	//Step1 - Global Variables Declaration
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",PassWord="admin123";
	String JobTitle="Sales7",JobDescr="Sales7 descr",JobNote="Sales7 Note";
	
	
  @Test
  public void JobsTest() throws Exception {
	  
	
	  TC01_Add_Jobs T11=new TC01_Add_Jobs();
	  
	  T11.OpenChromeBrowser();
	  T11.OpenOrangeHRM(TestURL); //Step2 - Passing Global variables to the methods
	  T11.Login(UserName,PassWord);//Step2 - Passing Global variables to the methods
	  //T11.AddJobs(JobTitle,JobDescr,JobNote);//Step2 - Passing Global variables to the methods
		
	 WebDriverWait wait = new WebDriverWait(driver,60);
	 WebElement logoutbutton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-icon bi-caret-down-fill oxd-userdropdown-icon"))) ;
	 
	 WebElement logoutbutton1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("123"))) ;
	 logoutbutton.click(); //15
	  
	  
	  //Timeout Exception
	  
	  //findElement(By.xpath("//a[text()='Logout']")).click();
	  
  }
  
  
  
  
  public void AddJobs(String JobTitle,String JobDescr,String  JobNote)throws Exception {
	  
	  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
	  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
	  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
	  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
	
	  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobTitle);
	  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDescr);
	  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote);
	  
	  Thread.sleep(5000);
	  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
	
	  
  }
  

  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
	  
  }
  
  
  //Step3 - Create Local Variables at Method Level and Replace sendKeys value
  public void OpenOrangeHRM(String TestURL1) throws Exception {
	  
		driver.get(TestURL1);
  }
  
  
  //Step3 - Create Local Variables at Method Level and Replace sendKeys value
  public void Login(String UserName1,String PassWord1) throws Exception {
	 
		findElement(By.name("username")).sendKeys(UserName1);
		findElement(By.name("password")).sendKeys(PassWord1);
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click(); 
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
