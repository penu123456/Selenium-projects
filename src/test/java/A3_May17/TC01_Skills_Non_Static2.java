package A3_May17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Skills_Non_Static2 {
	
	//Declaration
	WebDriver driver;
	
	//Step1 - Test Data - Global Variables
	String TestURl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",Password="admin123";
	String SkillName="Java20",SkillDescr="Java20 descr";
	
	
  @Test
  public void MainTest1() throws Exception {
	  
	  TC01_Skills_Non_Static2 T1=new TC01_Skills_Non_Static2();
	  
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM(TestURl);//Step2 - Passing Global variables to methods
	  T1.Login(UserName,Password);//Step2 - Passing Global variables to methods
	  T1.AddSkills(SkillName,SkillDescr);//Step2 - Passing Global variables to methods

	
  }
  
  
  public void OpenChromeBrowser() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
  }
  
  public void OpenOrangeHRM(String TestURl1) {
	  
		driver.get(TestURl1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
	  
  }
  
  
  
  public void Login(String UserName1,String Password1) throws Exception {
	  

		findElement(By.name("username")).sendKeys(UserName1);
		findElement(By.name("password")).sendKeys(Password1);
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	
  }
  
  
  
  
  
  public void AddSkills(String SkillName1,String SkillDescr1) throws Exception {
	  

		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
	
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName1);
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr1);
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
	  
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
