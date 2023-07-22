package A_dropdown;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WithoutselectTag {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
		
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		
		findElement(By.xpath("//span[text()='Organization ']")).click();
		findElement(By.linkText("Locations")).click();
		
	
		Thread.sleep(5000);
		
		
	
		findElement(By.xpath("//div[text()='-- Select --']")).click();
		
		Thread.sleep(5000);
	
		List<WebElement> dropdown=driver.findElements(By.className("oxd-select-option"));
       
		for(WebElement element: dropdown)
		{
				
			if(element.getText().equals("Algeria"))
			{
				element.click();
				Thread.sleep(5000);
				break;
			}

		}
		
		driver.close();
		
  }
  
  public WebElement findElement(By by)throws Exception
	{
	    WebElement elem = driver.findElement(by);
	 
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    } 
	     
	    return elem;
	}
}
