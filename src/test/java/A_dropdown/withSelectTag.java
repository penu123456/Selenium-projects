package A_dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class withSelectTag {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select drpdwn=new Select(driver.findElement(By.tagName("select")));
		Thread.sleep(5000);
		//drpdwn.selectByVisibleText("Algeria");
		//Thread.sleep(5000);
		//drpdwn.selectByValue("DZA");
		//Thread.sleep(5000);
		drpdwn.selectByIndex(3);
  }
  
  public WebElement findElement(By by)throws Exception
	{
	    WebElement elem = driver.findElement(by);
	 
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    } 
	     
	    return elem;
	}
}
