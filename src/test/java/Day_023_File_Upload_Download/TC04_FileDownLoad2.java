package  Day_023_File_Upload_Download;
import org.openqa.selenium.By;	

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class TC04_FileDownLoad2
{
	static WebDriver driver;
	 
		public String DestinationFile;
		
		//public  int iRow;
		
		// Draws a red border around the found element. Does not set it back anyhow.
		public WebElement findElement(By by)throws Exception {
		    WebElement elem = driver.findElement(by);
		 
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		    } 
		    Thread.sleep(10);
		    
		    return elem;
		    
		    
		    
		    
		}
	 	
	    
	   

	    @Test
		public void File_Download()throws Exception
		  {
			
			//SendKeys
	    	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				// driver =new ChromeDriver();
				// driver.manage().window().maximize() ;	
				 
				 String downloadFilepath = "D://Temp";
				 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				 chromePrefs.put("download.default_directory", downloadFilepath);
				 ChromeOptions options = new ChromeOptions();
				 options.setExperimentalOption("prefs", chromePrefs);
				 DesiredCapabilities cap = DesiredCapabilities.chrome();
				 cap.setCapability(ChromeOptions.CAPABILITY, options);
				 
				 driver = new ChromeDriver(cap);
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
				 
				 
				 driver.get("https://opensource-demo.orangehrmlive.com/");
	    	
				findElement(By.id("txtUsername")).sendKeys("Admin");
				findElement(By.id("txtPassword")).sendKeys("admin123");
				findElement(By.id("btnLogin")).click();
				
			 	 findElement(By.linkText("PIM")).click();
			 	 findElement(By.id("menu_pim_viewEmployeeList")).click();
			 	 findElement(By.linkText("0272")).click();
			 	 
			 	//*[@id='tblAttachments']/tbody/tr/td[2]
			 	 
			 	 String str1="//*[@id='tblAttachments']/tbody/tr/td[2]";
			 	// findElement(By.xpath(str1)).click();
			 	 
	    		 String fname = findElement(By.xpath(str1)).getText(); // To get inner web element text
	    		 findElement(By.linkText(fname)).click(); // clicks on the file
	    		 
	    		 Thread.sleep(5000);
	 		  	
			 	// String SrcFile="C:\\Users\\Supriya\\Downloads\\"+fname;
			 	 //String DestinationFile="C:\\HTML Report\\"+fname;
		
			 	//Thread.sleep(6000);
			 	//moveFile(SrcFile, DestinationFile);

	    		 
		        
			 	 
		  }	 	 
			 	 
	
	    public static void moveFile(String src, String dest ) throws InterruptedException {
	        Path result = null;
	        try {
	           result =  Files.move(Paths.get(src), Paths.get(dest));
	           
	           
	           Thread.sleep(5000);
	        } catch (IOException e) {
	           System.out.println("Exception while moving file: " + e.getMessage());
	        }
	        if(result != null) {
	           System.out.println("File moved successfully.");
	        }else{
	           System.out.println("File movement failed.");
	        }  
	     }
	    
	
		
	
	}