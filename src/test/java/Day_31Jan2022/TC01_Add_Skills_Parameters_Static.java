package Day_31Jan2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills_Parameters_Static {
	
	static WebDriver driver;
	
	//Step1 - Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",Password="admin123";
	String SkillName="Java17",SkillDescr="Java17 descr";
	
	
  @Test
  public void SkillsTest() throws Exception {
	  
	  
	  TC01_Add_Skills_Parameters_Static.OpenChromeBrowser();
	  TC01_Add_Skills_Parameters_Static.OpenOrangeHRM(TestURL);  //Step2
	  TC01_Add_Skills_Parameters_Static.Login(UserName,Password);//Step2
	  TC01_Add_Skills_Parameters_Static.AddSkills(SkillName,SkillDescr);//Step2

		
	  
  }
  
 
  
  public static void OpenChromeBrowser() throws Exception {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }
  
  
  
  
  public static void OpenOrangeHRM(String TestURL1) throws Exception {
	  

		driver.get(TestURL1);
  }
  
  
  
  
  public static void Login(String UserName1,String Password1) throws Exception {
	  

		findElement(By.id("txtUsername")).sendKeys(UserName1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
		
  }
  
  
  
  public static void AddSkills(String SkillName1,String SkillDescr1) throws Exception {
	  

		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys(SkillName1);
		findElement(By.id("skill_description")).sendKeys(SkillDescr1);
	findElement(By.id("btnSave")).click();
	  
  }
  
  
	
public static  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);

	}
	return elem;
}
  
  
  
  
  
  
  
  
  
  
  
  
  
}
