package  Day_021_Java_Script_Executer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;			
import org.testng.annotations.Test;			
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TC02_Send_Keys 
{		
	
	WebDriver driver;
	
	
    @Test		
    public void Login() throws Exception 					
    {		
       	
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
         driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");			
      
         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         
         JavascriptExecutor js = (JavascriptExecutor)driver;	
         Thread.sleep(5000);              
         WebElement username1= findElement(By.xpath("//input[@name='username']"));
         Thread.sleep(5000);   
         js.executeScript("arguments[0].setAttribute('value','Admin')", username1);
        
         Thread.sleep(5000);   
         WebElement password1= findElement(By.xpath("//input[@name='password']"));
         Thread.sleep(5000);   
         js.executeScript("arguments[0].setAttribute('value','admin123')", password1);
        
         Thread.sleep(5000);   
         WebElement button = findElement(By.xpath("//button[@type='submit']"));
         Thread.sleep(5000);   
         js.executeScript("arguments[0].click();", button);
        
    
        
           
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