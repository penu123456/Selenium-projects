package PAGES3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	WebDriver driver;
	
	
	public void HomePage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void Logout() throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		  ///Thread.sleep(60000);
		  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		  
		 // Thread.sleep(5000);
		  
		 // findElement(By.xpath("//a[text()='Logout']")).click();
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
