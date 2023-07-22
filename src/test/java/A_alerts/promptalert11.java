package A_alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class promptalert11 {
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	  
	  driver.get("https://javascript.info/alert-prompt-confirm");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.findElement(By.linkText("Run the demo")).click();
	  Alert alert1= driver.switchTo().alert();
	 
	  alert1.sendKeys("smitha");
	  Thread.sleep(5000);
	
	  alert1.accept();
	  
	  
	  alert1.accept();
	  
  }
}
