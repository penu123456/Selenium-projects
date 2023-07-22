package ABC_Feb2_2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills1 {
	
	WebDriver driver;
	
	
  @Test
  public void SkillsTest() throws Exception {
	  
	  TC01_Add_Skills1 T1=new TC01_Add_Skills1();
	  
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM();
	  T1.Login();
	  T1.AddSkills();
	
		
  }  
  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize() ;	
  }
  
  public void OpenOrangeHRM() throws Exception {
	  

		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  public void Login() throws Exception {
			
	findElement(By.name("username")).sendKeys("Admin");
	findElement(By.name("password")).sendKeys("admin123");
	findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  public void AddSkills() throws Exception {
	  
	  findElement(By.xpath("//span[text()='Admin']")).click();
		findElement(By.xpath("//span[text()='Qualifications ']")).click();
		findElement(By.xpath("//a[text()='Skills']")).click();
		findElement(By.xpath("(//button[@type='button'])[2]")).click();
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Java18");
		findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("Java18 descr");
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
