package A_dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class valuesfromexcel {
	
	static WebDriver driver;
	
	@DataProvider(name="OrangeHRM")
	public static Object[][] datafromexcel() throws Exception
	{
		ExcelApiTest4 excel=new ExcelApiTest4();
		Object[][] testdata=excel.getTableArray("C:\\HTML Report1\\Orangehrm\\skills1.xlsx","Sheet1");
		return testdata;
		
	}
	
   @Test(dataProvider="OrangeHRM")
  public void Addskills(String TestURL,String UserName,String Password,String SkillName,String SkillDesc) throws Exception
  {   
	   
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.manage().window().maximize() ;	
		driver.get(TestURL);
		
		
		
		//Login
		findElement(By.name("username")).sendKeys(UserName);
		findElement(By.name("password")).sendKeys(Password);
		findElement(By.xpath("//button[@type='submit']")).click();
					
				//AddSkills
				findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
				findElement(By.xpath("//span[text()='Qualifications ']")).click();
				findElement(By.xpath("//a[text()='Skills']")).click();
				findElement(By.xpath("//button[text()=' Add ']")).click();
				findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
				findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(SkillDesc);
				findElement(By.xpath("//button[text()=' Save ']")).click();
				driver.close();  
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
