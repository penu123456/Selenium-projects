package ABC_Data3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02 {
	
	WebDriver driver;
	
	static String username="//input[@name='username']";
	static String Password="//input[@name='password']";
	static String LoginButton="//button[@type='submit']";
	
	
	static String AdminButton="//span[text()='Admin']";
	static String Qualifications="//span[text()='Qualifications ']";
	static String Skills="//a[text()='Skills']";

	
	
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(username)).sendKeys("Admin");
		driver.findElement(By.xpath(Password)).sendKeys("admin123");
		driver.findElement(By.xpath(LoginButton)).click();
	  
		driver.findElement(By.xpath(AdminButton)).click();
		driver.findElement(By.xpath(Qualifications )).click();
		driver.findElement(By.xpath(Skills)).click();
		
	  
	  
	  
  }
}
