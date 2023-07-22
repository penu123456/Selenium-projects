package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {
	
	WebDriver driver;
  @Test
  public void sample() throws InterruptedException{
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://testautomationpractice.blogspot.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  WebElement source=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
      WebElement target=driver.findElement(By.id("droppable"));
      
      Actions act=new Actions(driver);
        //act.dragAndDrop(source, target).perform();
      
      
        act.clickAndHold(source).moveToElement(target).release().build().perform();
      Thread.sleep(3000);
      driver.close();
   
  }
}
