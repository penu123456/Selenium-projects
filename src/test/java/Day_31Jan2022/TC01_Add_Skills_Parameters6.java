package Day_31Jan2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Add_Skills_Parameters6 {
	
	WebDriver driver;
	
	//Step1 - Global Variables
	//String TestURL="https://opensource-demo.orangehrmlive.com/";
	//String UserName="Admin",Password="admin123";
	//String SkillName="Java16",SkillDescr="Java16 descr";
	
	

	  @DataProvider(name = "Orange1")
	  public static Object[][] Test1() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java51","Java51 descr" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java52","Java52 descr" },
	         	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java53","Java53 descr" }
	        	};
	  }
	  
	  
	
  @Test(dataProvider="Orange1")
  public void SkillsTest( String TestURL,String UserName,String Password,
		  String SkillName ,String SkillDescr) throws Exception {
	  
	  TC01_Add_Skills_Parameters6 T1= new TC01_Add_Skills_Parameters6();
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM(TestURL);  //Step2
	  T1.Login(UserName,Password);//Step2
	  T1.AddSkills(SkillName,SkillDescr);//Step2

		
	  
  }
  
  
  
 
  
  public void OpenChromeBrowser() throws Exception {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }
  
  
  
  
  public void OpenOrangeHRM(String TestURL1) throws Exception {
	  

		driver.get(TestURL1);
  }
  
  
  
  
  public void Login(String UserName1,String Password1) throws Exception {
	  

		findElement(By.id("txtUsername")).sendKeys(UserName1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
		
  }
  
  
  
  public void AddSkills(String SkillName1,String SkillDescr1) throws Exception {
	  

		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys(SkillName1);
		findElement(By.id("skill_description")).sendKeys(SkillDescr1);
	findElement(By.id("btnSave")).click();
	  
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
