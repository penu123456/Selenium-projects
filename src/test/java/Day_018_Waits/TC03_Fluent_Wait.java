package Day_018_Waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class TC03_Fluent_Wait {
	
	
    static WebDriver driver;

	
	
	
	
	@Test
	public void Login_Test() throws Exception
	{
		
		
		  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		//Login
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				//AddSkills
				findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
				findElement(By.xpath("//span[text()='Qualifications ']")).click();
				findElement(By.xpath("//a[text()='Skills']")).click();
				findElement(By.xpath("//button[text()=' Add ']")).click();
				findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Oracle 8");
				findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys("Oracle 8 descr");
				
				//sytax starts here
				 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					       .withTimeout(120, TimeUnit.SECONDS)
					       .pollingEvery(30, TimeUnit.SECONDS)
					       .ignoring(NoSuchElementException.class);
					   
					   WebElement SaveButton = wait.until(new Function<WebDriver,WebElement>() {
						     public WebElement apply(WebDriver driver) {
						       return driver.findElement(By.xpath("//button[text()=' Save ']"));
						     }
						   });
					   
						//sytax ends here
				 
					   SaveButton.click();
				 
				 
	}
	
	

	
	
	// Draws a red border around the found element. Does not set it back anyhow.
		public static  WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			// draw a border around the found element
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}
				


}
