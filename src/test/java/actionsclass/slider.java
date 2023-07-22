package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class slider {
	
	WebDriver driver;
  @Test
  public void sample() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://jqueryui.com/slider/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.switchTo().frame(0);
	  
	  WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	  
	  Actions act=new Actions(driver);
	  act.dragAndDropBy(slider,1000,0).perform();
	  //act.clickAndHold(slider).moveByOffset(100, 0).build().perform();
	  Thread.sleep(3000);
  }
}
