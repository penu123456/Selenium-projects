package  Day_029_PageObjectModel1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import CommonUtil.OR;

public class LoginPage
{
	
	WebDriver driver;
	
	//Page specific Object Repository maintaining
	static String  UserName="//*[@id='txtUsername']";
	static String  PAssword="//*[@id='txtPassword']";
	static String  Loginbutton="//*[@id='btnLogin']";
	
	public void LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	
	public void Login(String UserName1,String Password1) throws Exception {
		
		findElement(By.xpath(UserName)).sendKeys(UserName1);
		findElement(By.xpath(PAssword)).sendKeys(Password1);
		findElement(By.xpath(Loginbutton)).click();
	}
	
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	
	
	
	
}















