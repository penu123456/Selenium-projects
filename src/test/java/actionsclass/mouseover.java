package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseover {
	
	WebDriver driver;
	
  @Test
  public void mysample() {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	  WebElement orders=driver.findElement(By.xpath("//span[text()='Your Orders']"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(signin).moveToElement(orders).click(). build().perform();
	  driver.close();
	  
	  
  }
}
