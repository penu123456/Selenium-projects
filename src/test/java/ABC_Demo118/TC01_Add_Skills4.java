package ABC_Demo118;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills4 {
	
	WebDriver driver;
	
	//Step1 - Global variable
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String USerName="Admin",Password="admin123";
	String SkillName="Java5",SkillDescr="Java5 descr";
	
	
  @Test
  public void SkillsTest()throws Exception {
	  
	  TC01_Add_Skills4 T1=new TC01_Add_Skills4();
	  
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM(TestURL); //Step2
	  T1.Login(USerName,Password);//step2
	T1.AddSKills(SkillName,SkillDescr);//Step2
	
	  
  }
  
  
  
  
  
  public void OpenChromeBrowser()throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
  }
  
  
  public void OpenOrangeHRM(String TestURL1)throws Exception {
	  

		driver.get(TestURL1);
  }
  
  public void Login(String USerName1,String Password1)throws Exception {
	  
		findElement(By.id("txtUsername")).sendKeys(USerName1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
  }
  
  public void AddSKills(String SkillName1,String SkillDescr1)throws Exception {
	  
		
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
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", elem);
	 
		}
		return elem;
	}



  
}
