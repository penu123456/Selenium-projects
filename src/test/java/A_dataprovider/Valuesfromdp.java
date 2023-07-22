package A_dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Valuesfromdp {
   WebDriver driver;
  
  @DataProvider(name="Orangehrm")
  public  Object[][] data()
  {
	 Object[][] data=
	{
		{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle12","Oracle12 desc" },
    	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java12","Java12 desc" },
    	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Selenium12","Selenium12 desc" }
    	
    	
     };
	  return data;
  }
  
 
  
 


  @Test(dataProvider="Orangehrm")
  public void addskills(String TestURL,String UserName,String Password,String skillname,String Skilldesc) throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		driver.get(TestURL);
		
		
		
		//Login
		findElement(By.name("username")).sendKeys(UserName);
		findElement(By.name("password")).sendKeys(Password);
		findElement(By.xpath("//button[@type='submit']")).click();
					
				//AddSkills
				findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
				findElement(By.xpath("//span[text()='Qualifications ']")).click();
				findElement(By.xpath("//a[text()='Skills']")).click();
				findElement(By.xpath("//button[text()=' Add ']")).click();
				findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(skillname);
				findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(Skilldesc);
				findElement(By.xpath("//button[text()=' Save ']")).click();
				driver.close();
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

