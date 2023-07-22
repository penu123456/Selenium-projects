package A_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame_by_name {
	
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://dzhxn2zqob34wazgtozeqg.on.drv.tw/www.bhavasri.com/Frames/AllContacts.html");
	  
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.switchTo().frame("Google_ContactForm");
	  
	  driver.findElement(By.id("fname")).sendKeys("Selenium");
	  driver.findElement(By.id("lname")).sendKeys("java");
	  driver.findElement(By.id("subject1")).sendKeys("hello selenium");
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame("Amazon_ContactForm");
	  driver.findElement(By.id("fname")).sendKeys("Manual");
	  driver.findElement(By.id("lname")).sendKeys("Testing");
	  driver.findElement(By.id("subject")).sendKeys("hello class");
	  driver.switchTo().defaultContent();
	  Thread.sleep(5000);
	 // driver.close();
	  
  }
}
