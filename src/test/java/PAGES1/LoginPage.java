package PAGES1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver; //0 or null
	
	//Object Repository
	String LoginButtonXPATH="//button[@type='submit']";
	
	
	
	public void LoginPage(WebDriver driver)
	{
		this.driver=driver;  //11112222
	}
	
	
	
	public void Login(String UserName,String PassWord) throws Exception
	{
		//Login
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				findElement(By.name("username")).sendKeys(UserName);
				findElement(By.name("password")).sendKeys(PassWord);
				findElement(By.xpath(LoginButtonXPATH)).click();
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
