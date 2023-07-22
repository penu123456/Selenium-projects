package A_javascriptexe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gettitle {
	WebDriver driver;
  @Test
  public void samp() {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  String title= js.executeScript("return document.title").toString();
	  System.out.println(title);
	  
  }
}
