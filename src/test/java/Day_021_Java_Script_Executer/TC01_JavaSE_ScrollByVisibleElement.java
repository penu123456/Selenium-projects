 package  Day_021_Java_Script_Executer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

//import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;			
import org.testng.annotations.Test;			



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TC01_JavaSE_ScrollByVisibleElement 
{		
	
	
	
	
	WebDriver driver;
	
	
    @Test		
    public void Login() throws Exception 					
    {		
     	
         System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
         driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
         driver.get("https://www.amazon.in/");

        
        
        WebElement Element =findElement(By.xpath("//a[text()='Australia']"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        
      
        
        WebElement Privacy=findElement(By.xpath("//a[text()='Privacy Notice']"));
        js.executeScript("arguments[0].scrollIntoView();", Privacy);
        

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