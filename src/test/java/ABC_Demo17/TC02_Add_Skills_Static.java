package ABC_Demo17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02_Add_Skills_Static {
	
	static WebDriver driver;
	
	//Step1 - Declare Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String USerName="Admin",Password="admin123";
	String SkillName="Java8",Skilldescr="Java8 descr";
	
  @Test
  public  void SkillsTest() throws Exception {
	  
	  TC02_Add_Skills_Static.OpenChromeBrowser();
	  TC02_Add_Skills_Static.OPenOrangeHRM(TestURL); // step2Pass Global Varibles in Main Test methods
	  TC02_Add_Skills_Static.Login(USerName,Password);
	  TC02_Add_Skills_Static.AddSKills(SkillName,Skilldescr);
		
  }
  
  
  
  public static void OpenChromeBrowser() throws Exception {
	
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	  ;
  }
  
  public static void OPenOrangeHRM(String TestURL1) throws Exception {
	  
		driver.get(TestURL1);
  }
  
  
  public static void Login(String USerName1,String Password1) throws Exception {
	  
		findElement(By.name("txtUsername")).sendKeys(USerName1);
		findElement(By.name("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
  }
  
  
  
  public static void AddSKills(String SkillName1,String SkillDescr1) throws Exception {
	  
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys(SkillName1);
		findElement(By.id("skill_description")).sendKeys(SkillDescr1);
		findElement(By.id("btnSave")).click();
  }
  
  
  
  
  
  public static WebElement findElement(By by) throws Exception 
 	{

 		WebElement elem = driver.findElement(by);  
 		
 		if (driver instanceof JavascriptExecutor) 
 		{
 		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", elem);
 	 
 		}
 		return elem;
 	}

  
  
  
  
  
}
