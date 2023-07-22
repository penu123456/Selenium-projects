package A_dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practicedropdown {
	
  WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	   System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	  
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
		
		 findElement(By.linkText("PIM")).click();
		 findElement(By.linkText("Employee List")).click();
		
		 findElement(By.xpath("//div[text()='-- Select --']")).click();
		 
		 List<WebElement> drp1=driver.findElements(By.xpath("//div[@role='option']//child::span"));
		 
			
	   dropdownhandle(drp1,"Full-Time Probation");
	   
	   driver.close();
		 
  }
  
  public void dropdownhandle(List<WebElement> drp1,String drptext) throws Exception
  {
	 for(WebElement option:drp1)
	 {
		 if(option.getText().equals(drptext))
		
		 {
			 option.click();
			 Thread.sleep(5000);
			 break;
		 }
	 }
	
  }
  
 public WebElement findElement(By by)throws Exception
 	{
 	    WebElement elem = driver.findElement(by);
 	 
 	    // draw a border around the found element
 	    if (driver instanceof JavascriptExecutor) {
 	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 	    } 
 	  return elem;
 	}
}
