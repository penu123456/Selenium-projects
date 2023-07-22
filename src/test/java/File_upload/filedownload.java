package File_upload;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class filedownload {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  

	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Login
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
		
		//PIM Module
		 findElement(By.linkText("PIM")).click();
		 findElement(By.linkText("Employee List")).click();
		 findElement(By.xpath("//div[text()='0070']")).click();
		 
		String filename=findElement(By.xpath("//div[text()='CssSelector.txt']")).getText();
		
		 //downloadbutton xpath
		 findElement(By.xpath("//i[@class='oxd-icon bi-download']")).click();
		 
		 
		 String sourcepath="C:\\Users\\USER\\Downloads\\"+filename;
		 //  C:\\Users\\user\\Downloads\\Cssselector.txt
		 
		 String destipath="C:\\Users\\USER\\Desktop\\Mydownloads\\"+filename;
	//   C:\\Users\\USER\\Desktop\\Cssselector.txt
		 Thread.sleep(8000);
		 
		// Path result=null;
		 
		 Files.move(Paths.get(sourcepath),Paths.get(destipath));
		
		 Thread.sleep(5000);
		 
	     System.out.println("File moved successfully");
		 
		 driver.close();
		 
  }
  public WebElement findElement(By by)throws Exception
	{
	    WebElement elem = driver.findElement(by);
	 
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    } 
	     
	    return elem;
	}
}
