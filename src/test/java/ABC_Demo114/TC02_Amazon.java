package ABC_Demo114;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC02_Amazon {
	
	
	WebDriver driver; //declaration
	
  @Test
  public void LoginTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.amazon.in/");
		//driver.get("https://flipkart.com");
		
		
		
	
		
		WebElement HelloSignIn=driver.findElement(By.xpath("//*[text()='Hello,Sign in']"));
		WebElement YourOrders=driver.findElement(By.xpath("//*[text()='Your Orders']"));
		
		 Actions actions = new Actions(driver);
		actions.moveToElement(HelloSignIn).
		moveToElement(YourOrders).
		click().build().perform();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;	
	    // js.executeScript("arguments[0].click();", LoginButton);
	 
  }
  
  
}
