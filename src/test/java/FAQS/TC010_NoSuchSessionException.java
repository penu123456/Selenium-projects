package FAQS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC010_NoSuchSessionException {
	
	WebDriver driver;

	
	@Test
	public void Open_Mercury() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();	
		
		driver.quit();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//https://www.katalon.com/resources-center/blog/selenium-exceptions/
	//https://dzone.com/articles/selenium-webdriver-exceptions
	//https://www.toolsqa.com/katalon-studio/common-exceptions-in-selenium-webdriver/
	//https://www.browserstack.com/guide/exceptions-in-selenium-webdriver
	
	//https://www.softwaretestinghelp.com/selenium-interview-questions-answers/
	//https://www.softwaretestinghelp.com/selenium-interview-questions-answers/
	
	//https://www.linkedin.com/pulse/11-most-common-exceptions-selenium-webdriver-logic-qa

}
}
