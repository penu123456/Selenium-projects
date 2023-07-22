package A_javascriptexe;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_new_Tab {
	
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("window.open()");
	  
	   
	  
	  
	  /* ArrayList<String>  tabs=new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(tabs.get(1));
	   driver.get("https://www.amazon.in/");
	   Thread.sleep(3000);
	   driver.switchTo().window(tabs.get(0));*/
  }
}
