package FAQS;

import java.util.concurrent.TimeUnit;

//http://makeseleniumeasy.com/2017/09/28/handling-elementnotvisibleexception-and-element-is-not-clickable-exception-in-selenium/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class TC003_ElementNotVisibleException {
	
	
	WebDriver driver;
	
	//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/ElementNotVisibleException.html

	@Test
	public void Open_Mercury1() throws Exception {
		
		  driver=TestBrowser.OpenChromeBrowser();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  findElement(By.name("txtUsername")).sendKeys("Admin");
		  findElement(By.name("txtPassword")).sendKeys("admin123");
		 // findElement(By.id("btnLogin")).click();
		  
		
		  findElement(By.xpath("//*[@id='frmLogin']/input[1]")).click();
		 // findElement(By.linkText("Logout")).click();
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
