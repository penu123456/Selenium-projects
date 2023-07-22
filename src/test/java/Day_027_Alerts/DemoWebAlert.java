package Day_027_Alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.NoAlertPresentException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

public class DemoWebAlert {
	
	
	static WebDriver driver;
	
	@Test
	public static void Test6() throws NoAlertPresentException,InterruptedException  {									
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53921");					
       // driver.findElement(By.name("submit")).submit();			
        driver.findElement(By.name("submit")).click();		
        
        
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= alert.getText();		
        		
        // Displaying alert message		
        //System.out.println("ALERT DISPLAYED as : "+alertMessage);	
                		
        // Accepting alert		
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
        alert.dismiss();	
    }	

}