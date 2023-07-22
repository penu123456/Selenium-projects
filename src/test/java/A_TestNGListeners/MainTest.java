package A_TestNGListeners;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class MainTest {
	WebDriver driver;
  @Test
  public void skillsTest() throws Exception {
	  

	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		//Login
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
					
		//AddSkills
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//span[text()='Qualifications ']")).click();
		findElement(By.xpath("//a[text()='Skills']")).click();
		
		findElement(By.xpath("//button[text()=' Add ']")).click();
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Oracle 28");
		findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys("Oracle 28 descr");
		findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
  }
  
  @Test
  public void failuretestcase() {
	  //To fail a test case
	  Assert.assertTrue(false);
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
