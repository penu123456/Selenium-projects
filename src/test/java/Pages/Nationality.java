package  Pages;
//import MercuryDemoTours;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Reporter_Example_Word.Reporter1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Reporter_Example_Word.ImageAttachmentInDocument1;


public class Nationality
{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	
	 ImageAttachmentInDocument1 IA1;
	 
	 Reporter1 R1;

	
	public void  Nationality(WebDriver driver,Reporter1 R1 , ImageAttachmentInDocument1 IA2)throws Exception
	{  
		this.driver=driver;
		this.R1=R1;
		this.IA1=IA2;
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
	
	
	
	
	
	



public   void NationalityDetails(String Nationality )throws Exception
{  
	

	try 
	{
	
		//findElement(By.linkText("Admin")).click();
		//findElement(By.linkText("Nationalities")).click();
		
		
		WebElement Admin=findElement(By.linkText("Admin"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin).click().build().perform();
		
		findElement(By.linkText("Nationalities")).click();
		
		
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		R1.TakeScreenShotAuto(driver,"Login Page - Click on Sign In","Pass");
		
	    String str=R1.getScreenShotPath(driver);
	    IA1.PasteImage("Nationality Page - Nationality Entered",str);
		


	    findElement(By.id("btnSave")).click();
	 
		WebElement Element2 = findElement(By.linkText(Nationality));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		
		//R1.TakeScreenShotAuto(driver,"Scroll Nationality ","Pass");
		
	    str=R1.getScreenShotPath(driver);
	    IA1.PasteImage("Nationality Page - Nationality Entered",str);
	
	 
	 	
	
	} 
	catch(NoSuchElementException e)
	{
		System.out.println("Error Message :"+e.getMessage());
		 R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
	}
 	catch(NoSuchFrameException  e)
	{
		System.out.println("Error Message :"+e.getMessage());
		 R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
	}
 	
	 
	
 
}
	
	
		 


		 
}
	


	
	