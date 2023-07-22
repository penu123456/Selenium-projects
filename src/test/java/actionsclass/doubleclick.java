package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class doubleclick {
	WebDriver driver;
	
  @Test
  public void mytest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://testautomationpractice.blogspot.com/");
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	WebElement dbutton=driver.findElement(By.xpath("//button[text()='Copy Text']"));
	 
	Actions act=new Actions(driver);
	 
    act.doubleClick(dbutton).perform();
	 Thread.sleep(5000);
	 driver.close();
		  
		  
  }
}
