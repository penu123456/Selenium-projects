package Abhishake_Demo_Feb29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class TC01_Login_Static_Parameters_Day6 {
	
	static WebDriver driver;
	
	//static String UserName="Admin",Password="admin123";
	//static String Nationality_Text="Indian819";
	
		
		//Step1
		 @DataProvider(name = "Orange2")
			public static Object[][] Authentication1() throws Exception {
				
				ExcelApiTest4 eat = new ExcelApiTest4();
				Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx", "Sheet1");
				
				System.out.println(testObjArray.length);
				return (testObjArray);
			}	 
		 
		 
	@Test(dataProvider="Orange2") //step2
	public void logintest(String TestURL , String UserName,String Password,String Nationality_Text) throws Exception //step3
	{
		TC01_Login_Static_Parameters_Day6.openBrowser(TestURL);
		TC01_Login_Static_Parameters_Day6.Login(UserName,Password);
		TC01_Login_Static_Parameters_Day6.AddNationalities(Nationality_Text);
		TC01_Login_Static_Parameters_Day6.CloseBrowser();
	}
	
	
	
	
	public static void openBrowser(String TestURL1) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get(TestURL1);
		
	}
	
	public static void Login(String UserName1,String Password1) throws Exception
	{
		findElement(By.id("txtUsername")).sendKeys(UserName1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
	}
	
	public static void AddNationalities(String Nationality_Text1) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality_Text1);
		findElement(By.id("btnSave")).click();
		
	}
	
	public static void CloseBrowser() throws Exception
	{
		driver.quit();
	}
	
	
	

	
	 public static  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	

}
