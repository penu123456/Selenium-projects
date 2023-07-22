package Day_021_Java_Script_Executer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollbyvisibletext {
	WebDriver driver;
  @Test
  public void Amazon()throws Exception
  
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
      driver =new ChromeDriver();
      driver.manage().window().maximize() ;	
      driver.get("https://opensource-demo.orangehrmlive.com/");
      
      /*WebElement Element = findElement(By.xpath("//a[text()='Australia']"));
      JavascriptExecutor js = (JavascriptExecutor)driver;		
      js.executeScript("arguments[0].scrollIntoView();", Element);*/
      
      
      WebElement UserName=findElement(By.id("txtUsername"));
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].setAttribute('value','Admin')",UserName);

      WebElement button=findElement(By.id("btnLogin"));
      js.executeScript("arguments[0].click()",button);
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
