package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboardactions1 {
	
	WebDriver driver;
  @Test
  public void mysamp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://text-compare.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  WebElement textbox1=driver.findElement(By.id("inputText1"));
	 WebElement textbox2=driver.findElement(By.id("inputText2"));
	  
	  textbox1.sendKeys("Hello,Welcome");
	  
	  
	  Actions act=new Actions(driver);
	
	  act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	  Thread.sleep(3000);
	  act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	  Thread.sleep(3000);
	  
	 // act.sendKeys(Keys.TAB);
	  textbox2.click();
	 Thread.sleep(3000);
	  act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	  Thread.sleep(5000);
	  
	  
  }
}
