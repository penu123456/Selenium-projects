package ABC_Demo17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Highlight_WebElement {
	
	
	WebDriver driver;
	
  @Test
  public void NationalitiesTest() throws Exception {
	  
	
	  TC01_Highlight_WebElement T1=new TC01_Highlight_WebElement();
	  
	  T1.Openchrome();
	  T1.OpenOrangeHRM();
	  T1.Login();
	  T1.AddNationalities();
			

		
				

  }
  
  public void Openchrome() throws Exception{
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }
  
  public void OpenOrangeHRM() throws Exception{
	  
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
  }
  
  
  public void Login() throws Exception{
	  
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
  }
  
  
  public void AddNationalities() throws Exception{
	  
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Indian147");
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
