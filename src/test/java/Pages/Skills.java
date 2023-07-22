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



public class Skills
{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	
	
	 
	 Reporter1 R1;

	
	public void  Skills(WebDriver driver,Reporter1 R1 )throws Exception
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
	
	
	
	
	
	





public   void AddSkills(String skills,String SkillDesc )throws Exception
{  
	

		
		WebElement Admin=findElement(By.xpath("//*[@id='admin']/a/span"));
		WebElement Qualification=findElement(By.xpath("//*[@id='admin']/ul/li[3]/a/span"));
		WebElement Skills=findElement(By.xpath("//*[@id='admin']/ul/li[3]/ul/li[1]/a/span"));
		
		
		Actions actions = new Actions(driver);
		 actions.moveToElement(Admin).
		 moveToElement(Qualification).
		 moveToElement(Skills).click().build().perform();
		
		 
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(frames.get(0));
		
		
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys(skills);
		findElement(By.id("skill_description")).sendKeys(SkillDesc);
		findElement(By.id("btnSave"));
		 	
		 
	 R1.TakeScreenShotAuto(driver,"Skills Page - Skills Entered","Pass");
	 findElement(By.id("btnSave")).click();
	 
	 	WebElement Element2 = findElement(By.linkText(skills));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		R1.TakeScreenShotAuto(driver,"Scroll Skills ","Pass");
	
		driver.switchTo().defaultContent();

	
	 
}
	
	
		 


		 
}
	


	
	