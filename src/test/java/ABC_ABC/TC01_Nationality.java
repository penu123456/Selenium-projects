package ABC_ABC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Nationality {
	
	
	WebDriver driver;
	
	
  @Test
  public void LoginTest() throws Exception {
	  

	  TC01_Nationality T1=new TC01_Nationality();
	  
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM();
	  T1.Login();
	  T1.AddNationality();
		
		
  }
  
  
  
  
  
  public void OpenChromeBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;
	  
  }
  
  
  public void OpenOrangeHRM() {
	  
	 	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }
  
  
  public void Login() throws Exception {
	  
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		
		findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
  
  
  
  
  public void AddNationality() throws Exception {
	  
	  
	  findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
		findElement(By.xpath("//a[text()='Nationalities']")).click();//Nationalities
		findElement(By.xpath("(//button[@type='button'])[2]")).click(); //Addbuttonn
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Indian148");
		
		Thread.sleep(5000);
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
