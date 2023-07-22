package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class static_methods {
	
	static WebDriver driver;
	
	static String  UserName="//*[@id='txtUsername']";
	static String  Password="//*[@id='txtPassword']";
	static String  Signin="//*[@id='btnLogin']";
	static String  Admin="//*[@id='menu_admin_viewAdminModule']/b";
	static String  Nationality="//*[@id='menu_admin_nationality']";
	
  @Test
  public void test01()throws Exception {
	  
	  static_methods.OpenChrome();
	  static_methods.Login();
	  static_methods.AddNationality();
	  
	  
	  
  }
  
  public static void OpenChrome()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  public static void Login()throws Exception
  {
	  findElement(By.xpath(UserName)).sendKeys("Admin");
		findElement(By.xpath(Password)).sendKeys("admin123");
		findElement(By.xpath(Signin)).click();
  }
  
  public static void AddNationality() throws Exception
  {
	  findElement(By.xpath(Admin)).click();
		findElement(By.xpath(Nationality)).click();
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
