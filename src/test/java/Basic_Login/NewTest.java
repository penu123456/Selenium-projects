package Basic_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	//Global Declaration
	 WebDriver driver;
	
  @Test
  public void MainMethod()
  {
	  NewTest TC01 =new NewTest();
	  
	  TC01.LaunchBrowser();
	  TC01.Login();
	  
  }
  
  public  void LaunchBrowser() 
  {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
  }

  
  public  void Login() 
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
				
  }
  }
  

