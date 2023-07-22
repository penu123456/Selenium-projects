package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboardactions {
	
	WebDriver driver;
  @Test
  public void sample() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://the-internet.herokuapp.com/key_presses");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  
	  Actions act=new Actions(driver);
	 
	  act.sendKeys(Keys.HOME).perform();
	  
	  act.sendKeys(Keys.ARROW_LEFT).perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.CONTROL).perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ALT).perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.TAB).perform();
	  
	  
	  
	  
  }
  
  
}
