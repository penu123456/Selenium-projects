package A_Waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Fluentwait {
	WebDriver driver;
  @Test
  public void f() {

	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		 
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(80, TimeUnit.SECONDS)
			       .pollingEvery(20, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
			   
			   WebElement userName = wait.until(new Function<WebDriver,WebElement>()
			       {
				     public WebElement apply(WebDriver driver) 
				     {
				       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
				     }
				   });
			
			   userName.sendKeys("Admin");
			   driver.findElement(By.name("password")).sendKeys("admin123");
			   driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
				
		
		
		
			   
			   
	  }
  
  
}
