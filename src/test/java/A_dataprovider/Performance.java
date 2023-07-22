package A_dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;



public class Performance {
	 WebDriver driver;
	 
	 int i=0;
	 
	
	@BeforeTest
	public void open_browser()
	{
		
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			
}
	
	@DataProvider(name="Orangehrm")
	public static Object[][] skillsdata() throws Exception
	{
		
		ExcelApiTest4 excel=new ExcelApiTest4();
		Object[][] data=excel.getTableArray("C:\\HTML Report1\\Orangehrm\\skills1.xlsx","Sheet1");
		return data;
		
	}
  @Test(dataProvider="Orangehrm")
  public void skills(String testurl,String username,String password,String skillname,String skilldesc) throws Exception {
	  
	  if(i==0)
	  {
		 i=i+1;
	  
	    openurl(testurl);
	    login(username,password);
	    addskills(skillname,skilldesc);
	 }
	  else
	  {
		 
		
		  addskills(skillname,skilldesc);
	  }
 }
  
  
  public  void openurl(String testurl) 
  {
	  driver.get(testurl);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
}
  
  public  void login(String username, String password) throws Exception
  {
	  findElement(By.name("username")).sendKeys(username);
		findElement(By.name("password")).sendKeys(password);
		findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  public  void addskills(String skillname, String skilldesc) throws Exception
  {
	  
	  Thread.sleep(5000);
	  findElement(By.xpath("//span[text()='Admin']")).click();
		
		findElement(By.xpath("//span[text()='Qualifications ']")).click();

		findElement(By.xpath("//a[text()='Skills']")).click();
		
		findElement(By.xpath("//button[text()=' Add ']")).click();
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(skillname);
		findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(skilldesc);

		findElement(By.xpath("//button[text()=' Save ']")).click();
		 

  }



  public WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	} 
  
  
@AfterTest
public void closebrowser()
{
	driver.close();
}
}
