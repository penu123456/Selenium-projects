package Day_025_ExcelUtil_Apache_POI;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

import java.util.concurrent.TimeUnit;



public  class TC05_Excel_Test_xlsx
{
		

	

	
    
    String TestURL,UserName,Password;
    String Nationality_Text;
    
    WebDriver driver;

    @Test
    public void hello()throws Exception
    {
    	
    	ExcelApiTest4 eat=new ExcelApiTest4();
    	//
    	
    	int RowCount=eat.getRowCount("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1");
    	
 		System.out.println("Row Count  :"+RowCount);
 		RowCount=RowCount-1;
 		
 		
 		
	 		for (int i=1;i<=RowCount;i++) //1<=3,2<=3,3<=3,4<=3(false)
	 		{
	    	 
	    	 TestURL=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,0);
	    	 UserName=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,1);
			 Password=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,2);
			 Nationality_Text=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,3);
			 
			 System.out.println(TestURL);
			 System.out.println(UserName);
			 System.out.println(Password);
			 System.out.println(Nationality_Text);
			 System.out.println("__________________________");
			 
			
			/* System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		     driver =new ChromeDriver();
			 driver.manage().window().maximize() ;	
			 driver.get(TestURL);
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
			 findElement(By.name("txtUsername")).sendKeys(UserName);
			 findElement(By.name("txtPassword")).sendKeys(Password);
			 findElement(By.id("btnLogin")).click();
			 
			 //driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			 
			 WebElement Admin=findElement(By.id("menu_admin_viewAdminModule"));
			 //js.executeScript("arguments[0].click();", Admim);
			 
				Actions actions = new Actions(driver);
				actions.moveToElement(Admin).click().build().perform();
			 
			 
			 
			 driver.findElement(By.id("menu_admin_nationality")).click();
			 findElement(By.id("btnAdd")).click();
			 findElement(By.id("nationality_name")).sendKeys(Nationality_Text);
			 findElement(By.id("btnSave")).click();
			 
			 //Scroll
			 WebElement Element2 = findElement(By.linkText(Nationality_Text));
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView();", Element2);
			 
			 driver.quit();*/
	 		}

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

