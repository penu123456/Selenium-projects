package Reporter_Example_Word;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills2 {
	
	
	//Step1 delcaration of webdriver
	static WebDriver driver;
	static ImageAttachmentInDocument1 IA;
	static Reporter1 R1;
	static String TestName;
	
	

	String strDate1;
	String str="";
	
  @Test
  public void SkilsTest() throws Exception {
	  
	  TC01_Add_Skills2 T123=new TC01_Add_Skills2();
	  

		IA = new ImageAttachmentInDocument1();
		IA.CreateHeader("Daily Status Report");
		
		SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
		Date now1 = new Date();
		strDate1 = sdfDate1.format(now1);
		
		System.out.println(strDate1);
		
		
		TestName="TC01_Login_"+strDate1;
		
		System.out.println("Test Name as122 :"+TestName);
		
		
		
	  
	  T123.OpenChromeBrowser();
	  T123.OpenOrangeHRM();
	  T123.Login();
	  T123.AddSKills();
	  
	  String Filename=IA.WordOutput_File(TestName);
	    WordConvertPDF.main(Filename);

  }
  
  
  
  public void OpenChromeBrowser() throws Exception {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	
		
		
		System.out.println("Test Name as123 :"+TestName);
		
		R1= new Reporter1(driver, "TC01");
		
		System.out.println("Test Name as124 :"+TestName);
	
	    
	   
	   // IA.PasteImage("Pass- open Orangehrm",str);
	  
  }
  
  
  public void OpenOrangeHRM() throws Exception {
	  
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(8000);
		str=R1.getScreenShotPath(driver);
	    IA.PasteImage("Pass- open Orangehrm",str);
  }
  
  public void Login() throws Exception {
	  
		//Login
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(8000);
		str=R1.getScreenShotPath(driver);
	    IA.PasteImage("Pass- Enter credentials",str);
	    
		findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  public void AddSKills() throws Exception {
	  
	//AddSkills
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//span[text()='Qualifications ']")).click();
		findElement(By.xpath("//a[text()='Skills']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Oracle 91");
		findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys("Oracle 91 descr");
		
		Thread.sleep(8000);
		str=R1.getScreenShotPath(driver);
	    IA.PasteImage("Pass- Skills Details",str);
		
		findElement(By.xpath("//button[text()=' Save ']")).click();
	  
  }
  
  
  
  
  
  
  
  
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	} 
  
  
  
  
  
  
  
  
  
  
  
  
}
