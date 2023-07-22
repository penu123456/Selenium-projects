package Amazon;

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

public class TC01_Add_Cart3 {
	
	WebDriver driver;
	static String LaptopPricesXpath="//span[@class='a-price-whole']";
	
	
  @Test
  public void CartTest() throws Exception 
  {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		
		findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		findElement(By.id("nav-search-submit-button")).click();
		
		
	    Thread.sleep(3000);
		
		List<WebElement> Laptops=driver.findElements(By.xpath(LaptopPricesXpath));
		
		System.out.println("Number of Laptop Prices:"+Laptops.size());

		Thread.sleep(3000);
		
	/*	for(WebElement Laptop: Laptops)
		{
			System.out.println("Laptopn Price is :"+Laptop.getText());
			System.out.println("__________");
		}
		*/
		
		Float sum=(float) 0;
		
		for(int i=0;i<Laptops.size();i++)
		{
			//System.out.println("Laptopn Price is :"+Laptops.get(i).getText());
			//System.out.println("__________");
			
			String str=Laptops.get(i).getText();
			
			if(str.length()!=0)
			{
			
				Float Fprice=getFloat_From_String(str);
			
				System.out.println("Laptopn Price in Float :"+Fprice);
			
				sum=sum+Fprice;
			}
			
		}
		
		System.out.println("Sum of all Laptop Prices:"+sum);
		
		
		
		
		
  }
  
  
  
  
  
public  WebElement findElement(By by) throws Exception 
{

	Thread.sleep(3000);
	WebElement elem = driver.findElement(by);  
	Thread.sleep(3000);
	
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
