package ABC_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import ExcelUtil.ExcelApiTest4;



public class TC01_Add_Locations3 {
	
	static WebDriver driver;
	
	
	
	//Step1 - copy and paste dataprovider synatx - Test Data modification
	 @DataProvider(name = "TestDataProvider1")
	  public static Object[][] Test1() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java1","Java1 Descr" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java2","Java2 Descr"  },
	           	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java3","Java3 Descr"  },
	           	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java4","Java4 Descr"  }
	        	};
	  }
	 
	 
	 @DataProvider(name = "TestDataProvider2")
	 public Object[] myDataProvider() {
	      
	     Object data[][]=  new Object[2][5];
	     // First student details
	     data[0][0]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[0][1]= "Admin";
	     data[0][2]= "admin123";
	     data[0][3]= "London";
	     data[0][4]= "United Kingdom";
	      
	     // Second student details
	     data[1][0]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[1][1]= "Admin";
	     data[1][2]= "admin123";
	     data[1][3]= "Delhi";
	     data[1][4]= "India";
	     
	     return data;
	      
	      
	 }
	 
	 
	 
	 
	 @DataProvider(name = "TC01_Add_Locations")
		public static Object[][] Authentication1() throws Exception {
			
			ExcelApiTest4 eat = new ExcelApiTest4();
			Object[][] data = eat.getTableArray("C://HTML Report//OrangeHRM6//Test3_Location.xlsx", "Sheet1");
			
			System.out.println(data.length);
			return (data);
		}
	 
	
  @Test(dataProvider="TC01_Add_Locations") //Step2 
  public void LocationsTest(String Browser,String TestURL,String USerName,String Password,String City,String Country)throws Exception {
	  
	  TC01_Add_Locations3 T1=new TC01_Add_Locations3();
	  
	 // T1.OpenChromeBrowser();
	  
	  if(Browser.equalsIgnoreCase("Chrome"))
		  driver=TestBrowser.OpenChromeBrowser();
	  else
		  driver=TestBrowser.FirefoxBrowser();
	  
	  T1.OpenOrangeHRM(TestURL); //Step2
	  T1.Login(USerName,Password);//step2
	  T1.AddLocations(City,Country);

	
	  
  }
  
  
  
  
  
  public void OpenChromeBrowser()throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
  }
  
  
  public void OpenOrangeHRM(String TestURL1)throws Exception {
	  

		driver.get(TestURL1);
  }
  
  public void Login(String USerName1,String Password1)throws Exception {
	  
		findElement(By.id("txtUsername")).sendKeys(USerName1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
  }
  
  public void AddLocations(String City1,String Country1)throws Exception {
	  
		findElement(By.linkText("Admin")).click();
		
		
		//findElement(By.linkText("Organization")).click();
		//findElement(By.linkText("Locations")).click();
		
		 Actions actions = new Actions(driver);
		
		WebElement Organization=findElement(By.linkText("Organization")); 
		 actions.moveToElement(Organization). click().perform();
		 
			Thread.sleep(2000);
		 
		 WebElement Locations=findElement(By.linkText("Locations")); 
		 actions.moveToElement(Locations). click().perform();
		

		
		//WebElement Objecr Reference
		
		Thread.sleep(2000);
		

		 actions.moveToElement(Organization).
		 moveToElement(Locations).
		 click().build().perform();
		
		
		Thread.sleep(2000);
		
		
		findElement(By.id("btnAdd")).click();
		
		findElement(By.id("location_name")).sendKeys(City1);
		
		Select dropdown2 = new Select(driver.findElement(By.id("location_country")));
		dropdown2.selectByVisibleText(Country1);
		
		findElement(By.id("btnSave")).click();
		
		driver.close();
  }
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", elem);
	 
		}
		return elem;
	}



  
}
