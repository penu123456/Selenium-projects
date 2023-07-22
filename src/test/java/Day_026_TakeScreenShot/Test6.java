package Day_026_TakeScreenShot;


import java.text.SimpleDateFormat;
import java.util.Date;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.apache.commons.io.FileUtils;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;



public class Test6 {
	
	static WebDriver driver;
	static String FolderLocation="D:\\Test5";

	
	
	@Test
	public void AddNationalitiess() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(scrFile, new File("C:\\ScreenShot1.jpg"));
	
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 Test6.TakescreenShot(FolderLocation,"screenshot1.jpg");
	 
	 
	 findElement(By.id("txtUsername")).sendKeys("Admin");
	 Test6.TakescreenShot(FolderLocation,"screenshot2.jpg");
	  
	  
	  findElement(By.id("txtPassword")).sendKeys("admin123");
	  Test6.TakescreenShot(FolderLocation,"screenshot3.jpg");
	  
	  findElement(By.id("btnLogin")).click();
	  Test6.TakescreenShot(FolderLocation,"screenshot4.jpg");
	 

		
	
	
	
	}
	
	

	
	public static void TakescreenShot(String FolderLocation1,String str1)throws Exception 
	{
		 TakesScreenshot scrShot4 =((TakesScreenshot)driver);
		  File SrcFile4=scrShot4.getScreenshotAs(OutputType.FILE);
		  
		  String str=FolderLocation1+"\\"+str1;
		  
		  FileUtils.copyFile(SrcFile4, new File(str));
		  
	}
	
	
	
	
	 public  static WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}
	 
	
	
	
	
	
	
	
	
	
	
	

}
