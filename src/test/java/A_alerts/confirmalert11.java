package A_alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class confirmalert11 {
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  //Thread.sleep(3000);
	  
	  Alert alert1= driver.switchTo().alert();
	  
	  //alert1.accept();
	   
	  Thread.sleep(3000);
	   
	  //alert1.accept();
	  
	   
	   alert1.dismiss();
	  
	  
  }
}
