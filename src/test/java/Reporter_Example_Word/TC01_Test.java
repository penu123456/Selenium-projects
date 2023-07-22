package  Reporter_Example_Word;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;

//import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.*;

import Pages.*;

public class TC01_Test
{
	
	WebDriver driver;
	@Test
	public void Test1() throws Exception {
		

		ImageAttachmentInDocument1 IA = new ImageAttachmentInDocument1();
		IA.CreateHeader("Daily Status Report");
		
		SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
		Date now1 = new Date();
		String strDate1 = sdfDate1.format(now1);
		
		System.out.println(strDate1);
		
		
		String TestName="TC01_Login_"+strDate1;
		
		System.out.println(TestName);
		
		 
		Reporter1 R1= new Reporter1(driver, "TC01");
		driver = TestBrowser.OpenChromeBrowser();
		
	
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		
		driver.get(TestURL);
	    String str=R1.getScreenShotPath(driver);
	    IA.PasteImage("Pass- open Orangehrm",str);
	    
	    
		findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		str=R1.getScreenShotPath(driver);
		
	    IA.PasteImage("Pass- Enter User Name",str);
		
		
	    findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");	
		str=R1.getScreenShotPath(driver);
		
	    IA.PasteImage("Pass- Enter Password",str);
		
	    
		findElement(By.id("btnLogin"));
		str=R1.getScreenShotPath(driver);
		IA.PasteImage("Pass- Enter Password",str);
		
		findElement(By.id("btnLogin"));
		R1.TakeScreenShotAuto(driver,"Login Page - Click on Sign In","Pass");
		findElement(By.id("btnLogin")).click();  
		
	
		Nationality Nati = new Nationality();
		Nati.Nationality(driver, R1,IA);
		Nati.NationalityDetails("Test4");
		
		
		driver.close();
	    String Filename=IA.WordOutput_File(TestName);
	    WordConvertPDF.main(Filename);
	
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
		
	
	
	
	
	
	
	
	

}












