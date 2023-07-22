package A_javascriptexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pageup_pagedown {
	WebDriver driver;
  @Test
  public void samp() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 //pagedown
	 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 
	 Thread.sleep(5000);
	 //pageup
	 js.executeScript("window.scrollTo(0,document.body.scrollTop)");
  }
}
