package File_upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadingFile {
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  findElement(By.name("username")).sendKeys("Admin");
	  findElement(By.name("password")).sendKeys("admin123");
	  findElement(By.xpath("//button[@type='submit']")).click();
		
	  findElement(By.linkText("PIM")).click();
	  findElement(By.xpath("//a[text()='Add Employee']")).click();
	 	 
	 	 
	 	findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Prabhas");
	 	findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("raju");
	 	findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("uppalapati");
	 	findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("1233");
	 	Thread.sleep(3000);
	 	findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
	 	Thread.sleep(5000);
	 	//String filepath="C:\\Users\\mahes\\OneDrive\\Desktop\\prabhas.jpeg";
	 	String filepath="C:\\friend.jpg";
	 	Photoupload(filepath);
	 	findElement(By.xpath("//button[@type='submit']")).click();
	 	
  }
    public void Photoupload(String filepath) throws AWTException, Exception {
    	
    	StringSelection ss=new StringSelection(filepath);
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    	
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_V);
    	Thread.sleep(5000);
    	
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_V);
    	Thread.sleep(5000);
	
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(7000);
	
   }
    

	public WebElement findElement(By by)throws Exception
	{
	    WebElement elem = driver.findElement(by);
	 
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    } 
	    Thread.sleep(10);
	    
	    return elem;
	}
 	
}
