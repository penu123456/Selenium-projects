package A_javascriptexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class generate_alert {
	WebDriver driver;
  @Test
  public void samp() {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("alert('This is sample alert')");
	 
	 
  }
}
