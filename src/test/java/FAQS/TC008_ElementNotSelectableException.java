package FAQS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC008_ElementNotSelectableException {
	
	WebDriver driver;
	
	
		
		@Test
		public void Open_Mercury() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_disabled");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id='cars']")));
		dropdown1.selectByIndex(1);
		
		
		}
	
	

}
