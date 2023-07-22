package A_frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame_by_index {
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://dzhxn2zqob34wazgtozeqg.on.drv.tw/www.bhavasri.com/Frames/AllContacts.html");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	  List<WebElement> frames=driver.findElements(By.tagName("iframe"));
	  int framecount=frames.size();
	  System.out.println("No.of frames:"+framecount);
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("fname")).sendKeys("Madhu");
	  driver.findElement(By.id("lname")).sendKeys("smitha");
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("subject1")).sendKeys("hello selenium");
	  driver.switchTo().parentFrame();
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(1);
	  driver.findElement(By.id("fname")).sendKeys("koshal");
	  driver.findElement(By.id("lname")).sendKeys("shanmukh");
	  driver.findElement(By.id("subject")).sendKeys("hello class");
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	  driver.close();
  }
}
