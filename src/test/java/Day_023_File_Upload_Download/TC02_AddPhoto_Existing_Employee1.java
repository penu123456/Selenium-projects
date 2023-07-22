package  Day_023_File_Upload_Download;
import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.*;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;




import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class TC02_AddPhoto_Existing_Employee1
{
	static WebDriver driver;
	
	@DataProvider (name = "TC01_Add_Employee_Data")
    public static  Object[][] Authentication1() throws Exception{
		
		ExcelApiTest4 eat= new ExcelApiTest4();
        Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC02_Photo.xlsx","Sheet1");
         System.out.println(testObjArray.length);
          return (testObjArray); 
	}
	
	@Test(dataProvider="TC01_Add_Employee_Data")
	public   void AddEmployee_call_allmethods(
			String UserName,String Password,String EmployeeId,String PhotoPath  )throws Exception
	{  
			
	     	driver=TestBrowser.OpenChromeBrowser();
	     	driver.get("https://opensource-demo.orangehrmlive.com/");
	     	
			  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	     	findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
			 findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
			 findElement(By.xpath(OR.login_click)).click();
			 
			 
			 findElement(By.linkText("PIM")).click();	
			 findElement(By.id("menu_pim_viewEmployeeList")).click();
			 findElement(By.id("empsearch_id")).sendKeys(EmployeeId);
			 findElement(By.id("searchBtn")).click();
			 findElement(By.linkText(EmployeeId)).click();
			 findElement(By.id("empPic")).click();
			 
			 
		 WebElement button =findElement(By.xpath("//*[@id='photofile']"));
		
		 Actions actions = new Actions(driver);
		  	actions.moveToElement(button).click().build().perform();

			 //	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[3]/form/fieldset/ol/li/input")).click();
		     //  JavascriptExecutor js = (JavascriptExecutor)driver;	
		     // js.executeScript("arguments[0].click();", button);
			
		       //*[@id="photofile"]
			 //findElement(By.xpath("//*[@id='photofile']")).click();
			 //findElement(By.id("photofile")).click();
		      
		      

		  	

			 Thread.sleep(5000);
			 
			// printFileSizeNIO(PhotoPath);
			 
			 
			 	PhotoUpload(PhotoPath);

			//driver.quit();
	}	
	
	
	
	 
	
	
	
	public static   void PhotoUpload(String PhotoPath)throws Exception
	{
		
		
		// Specify the file location with extension
		// StringSelection sel = new StringSelection("C:\\Users\\Sudhakar\\Desktop\\download1.jpg");
		 
		 StringSelection sel = new StringSelection(PhotoPath);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		
		 
		 // Create object of Robot class
		 Robot robot = new Robot();
	
		 //Thread.sleep(2000);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(2000);
		        
		       //  Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
	
		
		 Thread.sleep(8000);
	
		findElement(By.id("btnSave")).click();
		
		
		Thread.sleep(10000);
		 

		 
		
		
	}
	
	
	
	
	
	
	 public static void printFileSizeNIO(String fileName) throws Exception {

	        Path path = Paths.get(fileName);

	        try {

	            // size of a file (in bytes)
	            long bytes = Files.size(path);
	            System.out.println(String.format("%,d bytes", bytes));
	            System.out.println(String.format("%,d kilobytes", bytes / 1024));
	            
	            
	            if(bytes<=10500)
	            {
	            	TC02_AddPhoto_Existing_Employee1.PhotoUpload(fileName);
	            }
	            else
	            {
	            	Reporter.log("File size is exceeding the expected limit as 10500");
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
	

	
	// Draws a red border around the found element. Does not set it back anyhow.
	public static  WebElement findElement(By by)throws Exception {
	    WebElement elem = driver.findElement(by);
	 
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    } 
	    Thread.sleep(10);
	    
	    return elem;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



