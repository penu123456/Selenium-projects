package A_javascriptexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_operations {
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	
	 //scrollto
	  
	   //js.executeScript("window.scrollTo(0,2000);");//0-------2000
	   Thread.sleep(5000);
	   
	  //scrollby 
	   
	   //js.executeScript("window.scrollBy(0,1000);");//2000------3000
	   
	 WebElement elem1= findElement(By.linkText("Germany"));
	  WebElement elem2= findElement(By.linkText("Conditions of Use & Sale"));
	 // Thread.sleep(5000);
	  
	  //scrollintoview
	  
	  js.executeScript("arguments[0].scrollIntoView()",elem1);
	
	   
js.executeScript("(arguments[0].scrollIntoView());(arguments[1].scrollIntoView());",elem1,elem2);
	  
	 
      
	  
  }
  
 public  WebElement findElement(By by) throws Exception 
 	{
 				
 		 WebElement elem = driver.findElement(by);    	    
 		
 		 
 		if (driver instanceof JavascriptExecutor) 
 		{
 		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 	 
 		}
 		
 		return elem;
 	}
  
}
