package Day_025_ExcelUtil_Apache_POI;



import ExcelUtil.ExcelApiTest4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;




public  class TC02_Excel_Test_xlsx2
{
		
	


    String TestURL,UserName,Password;
    WebDriver driver=null;

    @Test
    public void hello()throws Exception
    {
    	
    	ExcelApiTest4 E1=new ExcelApiTest4();
    	 
    	 TestURL=E1.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",1,0);
    	// TestURL=str6;
    	 
    	 
   
    	 UserName=E1.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",1,1);
		 Password=E1.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",1,2);
		 
		 System.out.println(TestURL);
		 System.out.println(UserName);
		 System.out.println(Password);
		
		/* System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
		 driver.get(TestURL);
				
		 findElement(By.name("txtUsername")).sendKeys(UserName);
		 findElement(By.name("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		 driver.quit();*/

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

