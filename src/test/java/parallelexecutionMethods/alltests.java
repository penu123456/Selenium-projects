package parallelexecutionMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alltests {
	
	
  @Test
  public void addjobs() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//AddJobs
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Sales34");
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("Sales34 descr");
		driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys("Sales34 Note");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
		

  }
  
  @Test
  public void addnationality() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		//Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//AddNationality
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("indian1487");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
  }
  
  @Test
  public void addskills() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		//Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
					
				//AddSkills
				driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
				driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
				driver.findElement(By.xpath("//a[text()='Skills']")).click();
				driver.findElement(By.xpath("//button[text()=' Add ']")).click();
				driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Oracle 867");
				driver.findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys("Oracle 867 descr");
				driver.findElement(By.xpath("//button[text()=' Save ']")).click();
				driver.close();
				
  }
}
