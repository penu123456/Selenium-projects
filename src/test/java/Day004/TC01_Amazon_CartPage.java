package Day004;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Amazon_CartPage {
	
	WebDriver driver;
	
  @Test
  public void AddtoCartTest() throws Exception {
	  
	  TC01_Amazon_CartPage T2=new TC01_Amazon_CartPage();
	  
	  T2.OpenChromeBrowser();
	  T2.OpenAmazon();
	  T2.Adding_Mobile_to_Cartpage();
	  T2.Adding_Book_to_Cartpage();
	

  }
  
  
  public void OpenChromeBrowser() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize() ;	
  
  }
  
  
  
  public void OpenAmazon() throws Exception {
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
  
  
  public void  Adding_Mobile_to_Cartpage() throws Exception {
	  
		String Mibilexpath="//a[text()='Mobiles']";
		String SmartPhonesxpath="//img[@alt='Starting ₹6,999']";
		String Onepluxphonexpath="(//span[ contains(text(),'OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage)')  and @class='a-size-base a-color-base'])[1]";
		
		//Adding Mobile to Cartpage
		findElement(By.xpath(Mibilexpath)).click();
		findElement(By.xpath(SmartPhonesxpath)).click();
		findElement(By.xpath(Onepluxphonexpath)).click();
		String AddToCartxpath="//input[@value='Add to Cart']";
		findElement(By.xpath(AddToCartxpath)).click();
		String Cartxpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']";
		findElement(By.xpath(Cartxpath)).click();
	  
  }
  
  
  
  public void  Adding_Book_to_Cartpage() throws Exception {
	  
		//Adding Book to Cartpage
		String Bookspath="//a[text()='Books']";
		String specificBookxpath="//span[text()='Open Book : Not Quite a Memoir' ]";
		
		findElement(By.xpath(Bookspath)).click();
		findElement(By.xpath(specificBookxpath)).click();
		String AddToCartxpath="//input[@value='Add to Cart']";
		findElement(By.xpath(AddToCartxpath)).click();
		

		String Maincart="//span[contains(text(),'Cart')   and @class='nav-line-2']";
		findElement(By.xpath(Maincart)).click();
	  
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
