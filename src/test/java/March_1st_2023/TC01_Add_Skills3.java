package March_1st_2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills3 {
	
	WebDriver driver;
	
	//Parameterization
	
	//Step1 - Global Variables Declaration
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",PassWord="admin123";
	String SkillName="Java26",SkillDescr="Java26 descr";
	
	
  @Test
  public void SkillsTest() throws Exception {
	  
	
	  TC01_Add_Skills3 T11=new TC01_Add_Skills3();
	  
	  T11.OpenChromeBrowser();
	  T11.OpenOrangeHRM(TestURL); //Step2 - Passing Global variables to the methods
	  T11.Login(UserName,PassWord);//Step2 - Passing Global variables to the methods
	  T11.AddSkills(SkillName,SkillDescr);//Step2 - Passing Global variables to the methods
		

  }
  
  
  
  
  
  
  
  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
	  
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
  
  
  
  //Step3 - Create Local Variables at Method Level and Replace sendKeys value
  public void AddSkills(String SkillName1,String SkillDescr1) throws Exception {
	  
	  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName1);
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr1);
		Thread.sleep(5000);
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
