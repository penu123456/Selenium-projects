package File_upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class upload1 {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.guru99.com/test/upload/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("uploadfile_0")).sendKeys("F:\\pramod\\Pramod Prathivadi B Resume.docx");
	  
	  Thread.sleep(5000);
	
	  driver.findElement(By.id("submitbutton")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.close();
  }
}
