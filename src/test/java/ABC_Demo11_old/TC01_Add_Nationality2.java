package ABC_Demo11_old;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Nationality2 {
	
	static WebDriver driver ;
	
	 //Step1 - Declaring Global Variables
	 String TestURL="https://opensource-demo.orangehrmlive.com/";
	 String UserName="Admin",Password="admin123";
	 String NationalityName="Indian727";
	 
	 
	
	@Test
	public void login_test() throws Exception
	{
		
		
		TC01_Add_Nationality2.OpenChromeBrowser();
		TC01_Add_Nationality2.OpennOrangeHRM(TestURL);//step2 - Pass Global vriables to main methods 
		TC01_Add_Nationality2.Login(UserName,Password); //step 2- Pass Global vriables to main methods 
		TC01_Add_Nationality2.AddNationalities(NationalityName);//step2 - Pass Global vriables to main methods 
		
	}
	
	
	public static void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	}
	
	public static void OpennOrangeHRM(String TestURL1) throws Exception
	{
		driver.get(TestURL1);//Step3
	}
	
	public static void Login(String UserName1,String Password1) throws Exception
	{
		findElement(By.id("txtUsername")).sendKeys(UserName1);//step3
		findElement(By.id("txtPassword")).sendKeys(Password1);//step3
		findElement(By.id("btnLogin")).click();
	}
	
	public static void AddNationalities(String NationalityName1) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(NationalityName1); //STep3
		findElement(By.id("btnSave")).click();
	
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
