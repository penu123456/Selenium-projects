package ABC_Data3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login1 {
	
	WebDriver driver;
	
	
	static String username="//input[@name='username']";
	static String Password="//input[@name='password']";
	static String LoginButton="//button[@type='submit']";
	
	
	static String AdminButton="//span[text()='Admin']";
	static String Nationalities="//a[text()='Nationalities']";
	static String AddButton="(//button[@type='button'])[2]";
	static String NationalityText="(//input[@class='oxd-input oxd-input--active'])[2]";
	static String SaveButton="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']";

	
	
	
	
  @Test
  public void Test2() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath(username)).sendKeys("Admin");
		driver.findElement(By.xpath(Password)).sendKeys("admin123");
		driver.findElement(By.xpath(LoginButton)).click();
		

		driver.findElement(By.xpath(AdminButton)).click();
		driver.findElement(By.xpath(Nationalities)).click();
		driver.findElement(By.xpath(AddButton)).click();
		driver.findElement(By.xpath(NationalityText)).sendKeys("Indian149");
		driver.findElement(By.xpath(SaveButton)).click();
  }
  
 
  
}



