package Day005;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills_Static {
	
	static WebDriver driver;
	
	//Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";//Step2
	String userName="Admin",Password="admin123";//Step2
	String SkillName="Java15",SkillDescr="Java15 descr"; //Step2
	
	
  @Test
  public void SkillsTest() throws Exception {
	  


	  
	  TC01_Add_Skills_Static.OpenChromeBrowser();
	  TC01_Add_Skills_Static.OpenOrangeHRm(TestURL);  //Step3
	  TC01_Add_Skills_Static.Login(userName,Password); //Step3
	  TC01_Add_Skills_Static.AddSkills(SkillName,SkillDescr);//Step3
	  TC01_Add_Skills_Static.closeBrowser();
	  
  }
  
  
  
  public static void OpenChromeBrowser() throws Exception {
	  

	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize() ;	

	  
  }
  
  
  
  
  public static void OpenOrangeHRm(String TestURL) throws Exception {
	  
	  //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.get(TestURL);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	  
  }
  
  
  
  
  
  public  static void Login(String username,String password) throws Exception {
	  
	  findElement(By.name("username")).sendKeys(username);
	  findElement(By.name("password")).sendKeys(password);
	  findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(5000);
  }
  
  
  public static void AddSkills(String SkillName,String SkillDescr) throws Exception {
	  
	  findElement(By.xpath("//span[text()='Admin']")).click();
	  findElement(By.xpath("//span[text()='Qualifications ']")).click();
	  findElement(By.xpath("//a[text()='Skills']")).click();
	  findElement(By.xpath("//button[text()=' Add ']")).click();
	  findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
	  findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SkillDescr);
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	  
  }
  
  
  public static void closeBrowser() throws Exception {
	  
	  driver.quit();
	  
  }
  
  
  
  
  
  
  
  
  
  

  public  static WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
  
  
  
  
}
