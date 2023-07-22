package Day_011_Katalon_Recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PhotoUpload {
	WebDriver driver;
  @Test
  public void PhotoUpload() throws Exception{
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  
	  
	    driver.findElement(By.xpath("//div[@id='divUsername']/span")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
	    

	    driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
	    driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	    findElement(By.linkText("0345")).click();
	    
	    
	    findElement(By.id("empPic")).click();
	    findElement(By.id("photofile")).click();
	    findElement(By.id("photofile")).clear();
	    
	    findElement(By.id("photofile")).sendKeys("C:\\fakepath\\image2.jpg");
	   findElement(By.id("btnSave")).click();
	    
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
