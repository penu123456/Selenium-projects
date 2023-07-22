package Day_025_ExcelUtil_Apache_POI;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import ExcelUtil.ExcelApiTest4;

import java.util.concurrent.TimeUnit;


public  class TC06_Excel_Test_xlsx
{
		

    
    String TestURL,UserName,Password;
    String Nationality_Text;
    
   static WebDriver driver;

    @Test
    public void hello()throws Exception
    {
    	
    	ExcelApiTest4 eat=new ExcelApiTest4();
    	
    	int RowCount=eat.getRowCount("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1");
 		System.out.println("Row Count  :"+RowCount);
 		RowCount=RowCount-1;
 		
 		
	 		for (int i=1;i<=RowCount;i++)
	 		{
	    	 
	    	 TestURL=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,0);
	    	 UserName=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,1);
			 Password=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,2);
			 Nationality_Text=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,3);
			
			 TC06_Excel_Test_xlsx T1=new TC06_Excel_Test_xlsx();
			
			 driver=TestBrowser.OpenChromeBrowser();
			 
			 T1.openOrangeHRM(TestURL);
			 T1.Login(UserName, Password);	
			 T1.AddNationalities(Nationality_Text);
			 T1.closeBrowser();
			 
			
	 		}

    }
    
  
        
     
    public void openOrangeHRM(String TestURL) throws Exception
    {
		

		 driver.get(TestURL);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
      
    
    public void Login( String UserName,String Password) throws Exception
    {
   	 findElement(By.name("txtUsername")).sendKeys(UserName);
	 findElement(By.name("txtPassword")).sendKeys(Password);
	 findElement(By.id("btnLogin")).click();
    }
      
    
    
    public void AddNationalities(String Nationality_Text ) throws Exception
    {
    	
    	WebElement Admin=findElement(By.id("menu_admin_viewAdminModule"));
    	Actions actions = new Actions(driver);
		actions.moveToElement(Admin).click().build().perform();
		
		 findElement(By.linkText("Nationalities")).click();
		 findElement(By.name("btnAdd")).click();
		 findElement(By.id("nationality_name")).sendKeys(Nationality_Text);
		 findElement(By.id("btnSave")).click();
		 
		 //Scroll
		 WebElement Element2 = findElement(By.linkText(Nationality_Text));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", Element2);
		 
		 
    }
      
    
    public void closeBrowser()
    {
    	driver.quit();
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

