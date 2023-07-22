package A3_May17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Nationality3 {
	
	static WebDriver driver;
	
	//Step1- Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",Password="admin123";
	String NationalityText="Indian158";
	
	
  @Test
  public void MainTest1() throws Exception {
	  
		

	  TC01_Nationality3.OpenChromeBrowser();
	  TC01_Nationality3.OpenOrangeHRM(TestURL); //Step2
	  TC01_Nationality3.Login(UserName,Password);//Step2
	  TC01_Nationality3.AddNationalities(NationalityText);//Step2

  }
  
  
  
  
  
  public static void OpenChromeBrowser() throws Exception {
	  
	  	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	  
  }
  
  
  
  public static void OpenOrangeHRM(String TestURL1) throws Exception {
	  
	  	driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
  }
  
  
  
  public static void Login(String UserName1,String Password1) throws Exception {
	  
	    findElement(By.name("username")).sendKeys(UserName1);
		findElement(By.name("password")).sendKeys(Password1);
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
  }
  
  
  
  
  public static void AddNationalities(String NationalityText1) throws Exception {

		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(NationalityText1);
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
  }
  
  
  
  
  
  
  
  
  
  
  
  public static WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}

  
  
  
  
  
  
}
