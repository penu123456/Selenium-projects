package A_TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshot2 {
	 WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	 // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  Getsnapshot("snapshot1.jpeg");
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  Getsnapshot("snapshot2.jpeg");
	  
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  Getsnapshot("snapshot3.jpeg");
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Getsnapshot("snapshot4.jpeg");
	  }
  
  public  void Getsnapshot(String str) throws Exception 
  {
	TakesScreenshot ss=(TakesScreenshot)driver;
	File f=ss.getScreenshotAs(OutputType.FILE);
	String str1="F://NewLogin//"+str;
	//  C://newlogin//snapshot1.jpeg
	FileUtils.copyFile(f, new File(str1));
	
  }
}
