package ABC_Demo114;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC01_Login {
	
	
	WebDriver driver; //declaration
	

	String login_click="//button[@type='submit']";
	
  @Test
  public void LoginTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize() ;	
		
		WebElement Username=findElement(By.name("username"));
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Username.sendKeys("Admin"); 
		findElement(By.name("password34534534")).sendKeys("admin123");
		findElement(By.xpath(login_click)).click();
	 
  }
  
  
  
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
