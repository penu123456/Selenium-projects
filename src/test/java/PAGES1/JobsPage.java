package PAGES1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JobsPage {
	
	WebDriver driver; //0 or null
	
	//Object Repository
	String LoginButtonXPATH="//button[@type='submit']";
	
	
	
	public void JobsPage(WebDriver driver)
	{
		this.driver=driver;  //11112222
	}
	
	
	
	public void AddJobs(String JobTitle,String JobDescr,String JobNote) throws Exception
	{
		//Login
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
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
