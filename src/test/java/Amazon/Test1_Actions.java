package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1_Actions {
	
	static WebDriver driver;
	
  @Test
  public void Test1() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://amazon.in");
	
		
		//driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
		//driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[1]/span")).click();
		
		WebElement Hello_Signin=driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		WebElement Your_Account=driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[1]/span"));
		
		Actions actions1=new Actions(driver);
		actions1.moveToElement(Hello_Signin).moveToElement(Your_Account).click().build().perform();
		
		
	  
  }
  
  
  
}
