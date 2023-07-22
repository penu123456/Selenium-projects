package A9_May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Nationality {
	
	
	WebDriver driver;
	
	
  @Test
  public void MainTest1() throws Exception {
	  
	  TC01_Nationality T2=new TC01_Nationality();
	  T2.OpenChromeBrowser();
	  T2.OrangeHRM();
	  T2.Login();
	  T2.AddNationality();
		  
	    }
  
  public void OpenChromeBrowser() throws Exception {
	  
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	  
  }
  
  public void OrangeHRM() throws Exception {

    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// Implicit wait 
	  
	  
	  
  }
  public void Login() throws Exception {
	  
		
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	  
  }
  public void AddNationality() throws Exception {
	  
    driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Indian146");
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	  
	  
	  
  }
			
}	
	  
	  	
