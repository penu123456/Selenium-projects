package A_javascriptexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sendkeys_and_click {
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	 WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
	 WebElement button=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
	 
	  //JavascriptExecutor js=(JavascriptExecutor) driver;
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	 js.executeScript("arguments[0].setAttribute('value','selenium')",search);
	 
	 Thread.sleep(3000);

	 js.executeScript("arguments[0].click();",button);
	  
	  
	  
  }
}
