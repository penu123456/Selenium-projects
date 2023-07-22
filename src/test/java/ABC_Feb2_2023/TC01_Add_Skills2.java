package ABC_Feb2_2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills2 {
	
	WebDriver driver;
	
	//Step1 - Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",Password="admin123";
	String SkillName="Java21",SkillDescr="Jan21 descr";
	
  @Test
  public void SkillsTest() throws Exception {
	  
	  TC01_Add_Skills2 T1=new TC01_Add_Skills2();
	  
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM(TestURL); //Step2
	  T1.Login(UserName,Password);//Step2
	  T1.AddSkills(SkillName,SkillDescr);//Step2
	
		
  }  
  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize() ;	
  }
  
  public void OpenOrangeHRM(String TestURL1) throws Exception {
	  

		driver.get(TestURL1);
  }
  
  public void Login(String UserName1,String Password1) throws Exception {
			
	findElement(By.name("username")).sendKeys(UserName1);
	findElement(By.name("password")).sendKeys(Password1);
	findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  public void AddSkills(String SkillName1,String SkillDescr1) throws Exception {
	  
	  findElement(By.xpath("//span[text()='Admin']")).click();
		findElement(By.xpath("//span[text()='Qualifications ']")).click();
		findElement(By.xpath("//a[text()='Skills']")).click();
		findElement(By.xpath("(//button[@type='button'])[2]")).click();
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName1);
		findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SkillDescr1);
		findElement(By.xpath("//button[@type='submit']")).click();		
		
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  // to highlight web element border during execution time
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
