package ABC_ABC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void LoginTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();//Qualifications
		driver.findElement(By.xpath("//a[text()='Skills']")).click();  //Skills
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();  //Add button
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("JAVA10");
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("JAVA10 descr");	
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		

		
		
  }
  
  
  
  
  
  
  
}
