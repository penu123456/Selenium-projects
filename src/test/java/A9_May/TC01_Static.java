package A9_May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Static {
	
	
	static WebDriver driver;
	
	
  @Test
  public static void MainTest1() throws Exception {
	  
	  TC01_Static.OpenChromeBrowser();
	  TC01_Static.OrangeHRM();
	  TC01_Static.Login();
	  TC01_Static.AddNationality();
		  
	    }
  
  public static void OpenChromeBrowser() throws Exception {
	  
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	  
  }
  
  public static void OrangeHRM() throws Exception {

    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// Implicit wait 
	  
	  
	  
  }
  public static void Login() throws Exception {
	  
		
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	  
  }
  public static void AddNationality() throws Exception {
	  
    driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Indian146");
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	  
	  
	  
  }
			
}	
	  
	  	
