package Feb5_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Day_034_TestNG_Listeners.TestBrowser;
import ExcelUtil.ExcelApiTest4;

public class TC04_Login_DataProvider2 {
	
	
	static WebDriver driver;
	//Step1
	//String TestURL="https://opensource-demo.orangehrmlive.com/";
	//String UserName="Admin",Password="admin123";
	//String NationalityTex="Kenyas2";
	
	
	
	 @DataProvider(name = "Orange1")
	  public static Object[][] Test1() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indians127" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indians128" }
	        	};
	  }
	 
	 
	 @DataProvider(name = "TC01_Add_Nationality")
		public static Object[][] Authentication1() throws Exception {
			
			ExcelApiTest4 eat = new ExcelApiTest4();
			Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Nationality20.xlsx", "Sheet4");
			
			
			System.out.println(testObjArray.length);
			return (testObjArray);
		}
	
	
	@Test(dataProvider="TC01_Add_Nationality")
	public void Login_Test(String Browser,String TestURL,String UserName,String Password,String NationalityTex  ) throws Exception
	{
		
		TC04_Login_DataProvider2 TN1= new TC04_Login_DataProvider2();
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=TestBrowser.OpenChromeBrowser();
		}
			
		
		if(Browser.equalsIgnoreCase("FireFox"))
		{
			driver=TestBrowser.FirefoxBrowser();
		}
		//   TN1.OpenChromeBrowser();
		   TN1.OpenOrangeHRM(TestURL);
		   TN1.Login(UserName,Password);
		   TN1.Addnatialities(NationalityTex);
		   TN1.Logout();
		   TN1.closebrowser();
	
	}
	
	
	
	
	 
		
	 
	public  void OpenChromeBrowser()  throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	}


	public  void OpenOrangeHRM(String TestURL1) throws Exception
	{
		
		driver.get(TestURL1);
	}
	
	


	public  void Login(String UserName,String Password) throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys(UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
		findElement(By.name("Submit")).click();
		
		
	}
	

	
	
	public  void Addnatialities(String NationalityTex1) throws Exception
	{
		

		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(NationalityTex1);
		findElement(By.id("btnSave")).click();
		
	}
	
	
	
	
	public   void closebrowser() throws Exception
	{
		
		 driver.quit();

	}
	
	
	public   void Logout()throws Exception
	 {
		 findElement(By.id("welcome")).click();	 
		 Thread.sleep(3000);
		 findElement(By.linkText("Logout")).click();
		 
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
