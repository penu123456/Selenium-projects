package ABC_Data_Hai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills_NonStatic_Parametrs {
	
	
	//Step1 delcaration of webdriver
	WebDriver driver;
	
	//Step2 - Declaration of Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",PassWord="admin123";
	String SkillName="Oracle20",SkillDescr="Oracle 20 descr";
	
	
	
  @Test
  public void SkilsTest() throws Exception {
	  
	  TC01_Add_Skills_NonStatic_Parametrs T123=new TC01_Add_Skills_NonStatic_Parametrs();
	  
	  T123.OpenChromeBrowser();
	  T123.OpenOrangeHRM(TestURL);
	  T123.Login(UserName,PassWord);
	  T123.AddSKills(SkillName,SkillDescr);

  }
  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
	  
  }
  
  
  public void OpenOrangeHRM(String TestURL) throws Exception {
	  
		driver.get(TestURL);
  }
  
  public void Login(String UserName,String Password) throws Exception {
	  
		//Login
		findElement(By.name("username")).sendKeys(UserName);
		findElement(By.name("password")).sendKeys(Password);
		findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  public void AddSKills(String SkillName,String SkillDescr) throws Exception {
	  
	//AddSkills
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//span[text()='Qualifications ']")).click();
		findElement(By.xpath("//a[text()='Skills']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
		findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(SkillDescr);
		findElement(By.xpath("//button[text()=' Save ']")).click();
	  
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
