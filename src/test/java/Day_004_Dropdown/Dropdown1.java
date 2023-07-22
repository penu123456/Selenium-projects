package Day_004_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown1 {
	
	WebDriver driver;
  @Test
  public void DropDown() throws Exception 
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize() ;	
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  
	  Thread.sleep(5000);
	  
	  findElement(By.name("txtUsername")).sendKeys("Admin");
	  findElement(By.name("txtPassword")).sendKeys("admin123");
	  findElement(By.name("Submit")).click();
	  findElement(By.id("menu_admin_viewAdminModule")).click();
	  findElement(By.linkText("Organization")).click();
	  findElement(By.linkText("Locations")).click();
	  //driver.findElement(By.name("searchLocation[country]")).click();
	  
	  /*Select dropdown = new Select(driver.findElement(By.name("searchLocation[country]")));
	  dropdown.selectByIndex(11);
	  dropdown.selectByValue("SG");
	  dropdown.selectByVisibleText("Uganda");
	  
	  
	  Select dropdown1=new Select(driver.findElement(By.id("searchLocation_country")));
	  dropdown1.selectByValue("TR");*/
	  
	  Select dropdown =new Select (driver.findElement(By.name("searchLocation[country]")));
	  dropdown.selectByVisibleText("Argentina");
  }
  
  public   WebElement findElement(By by) throws Exception 
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
