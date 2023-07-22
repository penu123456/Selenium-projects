package ABC_Data2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC02_Login {
	
  WebDriver driver;
  
  static String username="//input[@id='txtUsername']";
  static String password="//input[@id='txtPassword']";
  static String LoginButton="//input[@id='btnLogin']";
  
  static String AdminElement="//b[text()='Admin']";
  
  static String NationalitiesElement="//a[text()='Nationalities']";
  


	
  @Test
  public void LoginTest() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.get("https://amazon.in");
		
		
		driver.findElement(By.xpath(username)).sendKeys("Admin");
		driver.findElement(By.xpath(password)).sendKeys("admin123");
		driver.findElement(By.xpath(LoginButton)).click();
		
		driver.findElement(By.xpath(AdminElement)).click();
		driver.findElement(By.xpath(NationalitiesElement)).click();
		
		
		
  }
  
  
  
}
