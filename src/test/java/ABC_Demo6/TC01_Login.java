package ABC_Demo6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	 WebDriver driver ;
	
	@Test
	public void GlobalVariables() throws Exception
	
	{
		TC01_Login TC1 = new TC01_Login();
		TC1.login_Test();
		TC1.OpenOrangeHRM();
		
	}
	
	
	public  void login_Test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
	}
	public  void OpenOrangeHRM() throws Exception
	
	
	{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
		
	}

}
