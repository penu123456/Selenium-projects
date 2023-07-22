package A_javascriptexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class highlighting {
	WebDriver driver;
  @Test
  public void samp() {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  WebElement username=driver.findElement(By.name("username"));
	  WebElement password=driver.findElement(By.name("password"));
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //js.executeScript("arguments[0].style.border='5px solid blue'",username);
	  
	
	// js.executeScript("(arguments[0].style.border='red 5px solid');(arguments[0].style.background='yellow')",username);
    js.executeScript("(arguments[0].style.border='red 10px solid');(arguments[1].style.border='blue 5px dotted');",username,password);

	  
  }
  
 /* public  WebElement findElement(By by) throws Exception 
 	{
 				
 		 WebElement elem = driver.findElement(by);    	    
 		
 		 
 		if (driver instanceof JavascriptExecutor) 
 		{
 		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 	 
 		}
 		
 		return elem;
 	}*/
  
}
