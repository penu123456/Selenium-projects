package ABC_Demo17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02_Add_Skills {
	
	WebDriver driver;
	
  @Test
  public void SkillsTest() throws Exception {
	  

	  TC02_Add_Skills T2=new TC02_Add_Skills();
	  
	  T2.OpenChromeBrowser();
	  T2.OPenOrangeHRM();
	  T2.Login();
	  T2.AddSKills();
		
  }
  
  
  
  public void OpenChromeBrowser() throws Exception {
	
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	  
  }
  
  public void OPenOrangeHRM() throws Exception {
	  
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  
  public void Login() throws Exception {
	  
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
  }
  
  
  
  public void AddSKills() throws Exception {
	  
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys("Java5");
		findElement(By.id("skill_description")).sendKeys("Java5 descr");
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
