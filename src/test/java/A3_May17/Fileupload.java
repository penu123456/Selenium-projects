package File_upload;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import File_download.download;

public class upload {
	
	WebDriver driver;
	
  @Test
  public void UploadingFile() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","c://chromedriver_win32//chromedriver.exe");
	   driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	 findElement(By.name("username")).sendKeys("Admin");
	 findElement(By.name("password")).sendKeys("admin123");
	 findElement(By.xpath("//button[@type='submit']")).click();
	 findElement(By.xpath("//span[text()='PIM']")).click();
	 findElement(By.linkText("Add Employee")).click();
	 findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("gopi");
	 findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("chand");
	 findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("penu");
	 
	WebElement sei= findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	Actions act = new Actions(driver);
	sei.click();
	act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	        sei.sendKeys(Keys.DELETE);
			//sei.clear();
			Thread.sleep(2000);
	       sei.sendKeys("44");
	// findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("44");
	 
	 findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
	 
		Thread.sleep(5000);
	 	//String filepath="C:\\Users\\mahes\\OneDrive\\Desktop\\prabhas.jpeg";
	 	String filepath="C:\\friend.jpg";
	 	Photoupload(filepath);
	 findElement(By.xpath("//button[@type='submit']")).click();
	 
	 
	 download d1=new download();	 
	 d1.downlaod(driver);
	 d1.downloadf();
	 	
	 	
	 	
}
 public void Photoupload(String filepath) throws AWTException, Exception {
 	
 	StringSelection ss=new StringSelection(filepath);
 	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
 	
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
 

	
  
  
  
	public WebElement findElement (By by)
	{
		WebElement elem=driver.findElement(by);
		
		if(driver instanceof JavascriptExecutor)
		{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].style.border='3px solid yellow'",elem);
		
	}
		return elem;
	}
    
}
