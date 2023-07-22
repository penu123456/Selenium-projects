package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Rightclick {
	WebDriver driver;
  @Test
  public void mytest() {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  WebElement rbutton=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  Actions act=new Actions(driver);
	  act.contextClick(rbutton).perform();
	  
  }
}
