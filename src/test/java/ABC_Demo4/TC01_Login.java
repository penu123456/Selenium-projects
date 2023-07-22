package ABC_Demo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement SigninButton=driver.findElement(By.id("btnLogin"));
		
				username.sendKeys("Admin");
				password.sendKeys("admin123");
				SigninButton.click();
		
		
	}

}
