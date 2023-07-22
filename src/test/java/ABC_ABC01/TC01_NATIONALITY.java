package ABC_ABC01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_NATIONALITY {
	
	WebDriver driver;
	
	
  @Test
  public void nationality() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.xpath("//Input[@name='username']")).sendKeys("Admin");
		
	
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
		
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();//Qualification
		driver.findElement(By.xpath("//a[text()='Skills']")).click();  //Skills
		driver.findElement(By.xpath("(//button[text()=' Add '])")).click();  //Add button
		
		
	  
  }
  
  
  
  
  
}
