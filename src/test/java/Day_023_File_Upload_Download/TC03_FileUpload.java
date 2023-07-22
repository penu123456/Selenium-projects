 package  Day_023_File_Upload_Download;
import org.openqa.selenium.By;	

import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class TC03_FileUpload
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
		public void File_upload()throws Exception
		  {
			
			//SendKeys
	    	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				 driver =new ChromeDriver();
				 driver.manage().window().maximize() ;	
				 driver.get("https://opensource-demo.orangehrmlive.com/");
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 Thread.sleep(5000);
	    	
				findElement(By.name("username")).sendKeys("Admin");
				findElement(By.name("password")).sendKeys("admin123");
				findElement(By.xpath("//button[@type='submit']")).click();
				
			 	 findElement(By.linkText("PIM")).click();
			 	 findElement(By.linkText("Employee List")).click();
			 	 
			 	 Thread.sleep(5000);
			 	 findElement(By.xpath("//div[text()='0279']")).click();
			 	 
			 	 Thread.sleep(3000);
			 	 
			 
			 	 
			 	//<input type="file" name="photofile" id="photofile">

			 	//findElement(By.name("photofile")).click();
			 	
				 findElement(By.xpath("(//img[@alt='profile picture'])[2]")).click();
			 	
					Thread.sleep(1000);
					WebElement  button=findElement(By.xpath("//i[@class='oxd-icon bi-plus']"));
					//button.click();
					
					//findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
					
					Actions actions = new Actions(driver);
				  	actions.moveToElement(button).click().perform();
			 	 
			 	
			 	 
			 	 String str1="C:\\HTML Report\\EMP_Photos\\image2.jpg";
			 	 PhotoUpload(str1);
			 	 
		        
			 	findElement(By.xpath("//button[text()=' Save ']")).click();
			 	
			 	 Thread.sleep(8000);
		  }	 	 
			 	 
	
	

		
		public   void PhotoUpload(String PhotoPath)throws Exception
		{
			
			//Step1 - File Path - Copy (CTRL + C)
			StringSelection sel = new StringSelection(PhotoPath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 
			 System.out.println("selection" +sel);
			 
			 
			 // Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(2000);
			      
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(2000);
			        

		       //  Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			 Thread.sleep(8000);
		
			//findElement(By.id("txtAttDesc")).sendKeys("comments 123");
		
			//findElement(By.name("btnSaveAttachment")).click();
		
		
		}
		
		
		
	
	}