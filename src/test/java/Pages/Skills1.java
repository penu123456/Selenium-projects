package  Pages;
//import MercuryDemoTours;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import HTMLReport.Reporter1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Skills1
{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	
	
	 
	 Reporter1 R1;

	
	public void  Skills1(WebDriver driver,Reporter1 R1 )throws Exception
	{  
		this.driver=driver;
		this.R1=R1;
	}
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception {
		
	    WebElement elem = driver.findElement(by);
	    	    
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        
	  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
	        
	    }
	    return elem;
	}
	
	
	
	
	
	



public   void AddSkills(String Nationality )throws Exception
{  
	

	try 
	{
	
		//findElement(By.linkText("Admin")).click();
		//findElement(By.linkText("Nationalities")).click();
		
		
		WebElement Admin=findElement(By.xpath("//*[@id='admin']/a/span"));
		WebElement Nationalities=findElement(By.xpath("//*[@id='admin']/ul/li[5]/a/span"));
		
		Actions actions = new Actions(driver);
		 actions.moveToElement(Admin).
		 moveToElement(Nationalities).click().build().perform();
		
		 
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(frames.get(0));
		
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		

		
	
	 R1.TakeScreenShotAuto(driver,"Nationality Page - Nationality Entered","Pass");
	 findElement(By.id("btnSave")).click();
	 
		WebElement Element2 = findElement(By.linkText(Nationality));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		
		R1.TakeScreenShotAuto(driver,"Scroll Nationality ","Pass");
	
	 
		driver.switchTo().defaultContent();

	 
	 	
	
	} 
	catch(Exception e)
	{
		
	}
	 
	
 
}
	
	
		 


		 
}
	


	
	