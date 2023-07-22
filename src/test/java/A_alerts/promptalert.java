package A_alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class promptalert {
	
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	 	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  Alert alert=driver.switchTo().alert();
	  
	 String str= alert.getText();
	  System.out.println("The message in the alert box is:"+ str);
	
	  alert.sendKeys("Selenium");
	  Thread.sleep(5000);
	  alert.accept();
	  //alert.dismiss();
	  
  }
}
