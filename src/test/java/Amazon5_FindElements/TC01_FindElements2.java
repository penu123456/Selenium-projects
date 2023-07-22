package Amazon5_FindElements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC01_FindElements2 {
	
	WebDriver driver;
	
	static String searchInbox="//input[@id='twotabsearchtextbox']";
	static String searchSubmit="//input[@id='nav-search-submit-button']";
	
	static String ListOfMobilesxpath="//span[@class='a-size-medium a-color-base a-text-normal']";
	
	static String MobilePrices="//span[@class='a-price-whole']";
	
	
	
	
	
  @Test
  public void CartTest() throws Exception 
  {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		
		
		findElement(By.xpath(searchInbox)).sendKeys("Mobiles");
		findElement(By.xpath(searchSubmit)).click();
		
		List<WebElement> Mobiles=driver.findElements(By.xpath(ListOfMobilesxpath));
		
		
		for(WebElement Mobile: Mobiles)
		{
			System.out.println(Mobile.getText());
			System.out.println("___________________");
		} 
		
		
		
		for(int i=0;i<Mobiles.size();i++)
		{
			System.out.println(Mobiles.get(i).getText());
			System.out.println("___________________");
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



public static  float getFloat_From_String(String str)
{

	String output = str.replace("?", "").replace(",", "");
	float f=Float.parseFloat(output);
	return f;
	
}



}
