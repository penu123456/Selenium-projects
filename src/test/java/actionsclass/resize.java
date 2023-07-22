package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class resize {
	
	WebDriver driver;
  @Test
  public void test() {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://jqueryui.com/resizable/");
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.switchTo().frame(0);
	 
	  
	  WebElement resize=driver.findElement(By.xpath("//div[@style='z-index: 90;'][3]"));
	  
	  
	  Actions act=new Actions(driver);
	 //act.dragAndDropBy(resize, 100, 150).perform();
	 
	 
	 
	 act.clickAndHold(resize).moveByOffset(100, 50).build().perform();
	  
  }
  
}
