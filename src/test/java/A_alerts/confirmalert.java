package A_alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class confirmalert {
	
	WebDriver driver;
  @Test
  public void samp() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  Alert alert=driver.switchTo().alert();
	  Thread.sleep(3000);
	  //alert.dismiss();
	 // alert.dismiss();
	  driver.switchTo().alert().dismiss();
	  
  }
}
