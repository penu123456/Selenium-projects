package A_Date_picker;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Date_picker {
	WebDriver driver;
	String birthmonth="May";
	String birthyear="1994";
	String date="10";
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  findElement(By.name("username")).sendKeys("Admin");
	  findElement(By.name("password")).sendKeys("admin123");
	  findElement(By.xpath("//button[@type='submit']")).click();
	  
	  findElement(By.xpath("//span[text()='My Info']")).click();
	  
	  WebElement gopi=findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]"));//o
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	  js.executeScript("arguments[0].click()",gopi);
	  
	/*WebElement elem=  findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elem);*/
	
	 
	           //  (or)
	 
	 /* WebDriverWait wait = new WebDriverWait(driver, 10);
	 try
	 {
	 
		 
		 findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]"));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]"))); 
	 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	 
	 System.out.println("Try block");
	 }
	
	 
	 catch (ElementClickInterceptedException e)
	 {	 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='oxd-input oxd-input--active']//parent::div[@class='oxd-date-input'])[2]")));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		 System.out.println("catch block");
	 }*/
	 
	 
	 
	 
	
	 Thread.sleep(3000);  
	  findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]")).click();
	 
	List<WebElement> months=  driver.findElements(By.xpath("//li[@class='oxd-calendar-dropdown--option']"));
	dropdown(months,birthmonth);
	
	
	findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[2]")).click();
	
	
	List<WebElement> years=  driver.findElements(By.xpath("//li[@class='oxd-calendar-dropdown--option']"));
	dropdown(years,birthyear);
	
	List<WebElement> dates=  driver.findElements(By.xpath("//div[@class='oxd-calendar-date']"));
	dropdown(dates,date);
  }
  
  
  public void dropdown(List<WebElement> drp,String Text)
  {
	  
	 
	  
	  for(WebElement drp1:drp)
		{
			if(drp1.getText().equalsIgnoreCase(Text))
			{
				drp1.click();
				break;
			}
		} 
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





