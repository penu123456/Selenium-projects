package  Day_007_TestNG_DataProvider_Lab3;
import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;

import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class OrangeHRM_DataProvider_Lab3
{
	static WebDriver driver;
	
	//if u want to execute u r test with multiple input test data , we can user Data Provider
	
	//step1
	 @DataProvider(name = "Orange2")
	  public static Object[][] Test1() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indians127" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indians128" },
	           	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indians129" }
	        	};
	  }
	 
	 
	
	 
	 @DataProvider(name = "Orange3")
		public static Object[][] Authentication1() throws Exception {
			
			ExcelApiTest4 eat = new ExcelApiTest4();
			Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Nationality3.xlsx", "Sheet1");
			
			
			System.out.println(testObjArray.length);
			return (testObjArray);
		}
		
	 
	
@Test(dataProvider = "Orange3") //step2 u r test will be connected to dataProvider 
public void Test1(String TestURL,String UserName,String Password,String Nationality) throws Exception {   
	//step3 ensure number of parameters
		
		
		//OpenChromeBrowser
		//driver = TestBrowser.OpenChromeBrowser();

		//OpenUrl
		//driver.get(TestURL);
		
		System.out.println(TestURL);
		System.out.println(UserName);
		System.out.println(Password);
		System.out.println(Nationality);
		System.out.println("________________________________");

		//SendKeys
		/* findElement(By.id("txtUsername")).sendKeys(UserName);
		 findElement(By.id("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		
			  
		 findElement(By.linkText("Admin")).click();
		 findElement(By.linkText("Nationalities")).click();
		 findElement(By.name("btnAdd")).click();
		 findElement(By.id("nationality_name")).sendKeys(Nationality);
		 findElement(By.id("btnSave")).click();	
		 
		
		 WebElement Element1 = findElement(By.linkText(Nationality));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", Element1);*/
			
		 	  
		// driver.quit();	 
		 

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
	
	
	
	
	
	
	 
	













