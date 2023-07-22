package Amazon5_FindElements;

import java.util.ArrayList;
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

public class TC01_FindElements {
	
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
		
		List<String> l1=new ArrayList<String>();
		
		for(WebElement Mobile: Mobiles)
		{
			//System.out.println(Mobile.getText());
			
			String str1=Mobile.getText();
			
			l1.add(str1);
			
			System.out.println("___________________");
		}  
		
		
	
		
		
	
		List<WebElement> Mobiles_Prices=driver.findElements(By.xpath(MobilePrices));
		
		
		for(WebElement Mobiles_Price: Mobiles_Prices)
		{
			System.out.println(Mobiles_Price.getText());
			System.out.println("___________________");
		}
		
		for(int i=0;i<Mobiles_Prices.size();i++)
		{
			System.out.println(Mobiles_Prices.get(i).getText());
			System.out.println("___________________");
			
		}
		
		
		
	/*	float sum=(float) 0;
		
		for(int i=0;i<Mobiles_Prices.size();i++)
		{
			
			//System.out.println(Mobiles_Prices.get(i).getText());
			
			String str=Mobiles_Prices.get(i).getText();
			
		     Float MobilePrice=getFloat_From_String(str);
		     
		     System.out.println("Mobile Price is :"+MobilePrice);
		     System.out.println("___________________");
		     
		     sum=(float)sum+(float)MobilePrice;
			
		}
		
		
		
		System.out.println(" Sum of Total items..... "+sum);
		
		
		
		*/
		
		
		
		
		
		
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
