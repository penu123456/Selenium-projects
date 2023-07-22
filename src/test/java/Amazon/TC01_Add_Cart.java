package Amazon;

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

public class TC01_Add_Cart {
	
	WebDriver driver;
  @Test
  public void CartTest() throws Exception 
  {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		
		
		
		//WebDriverWait wait2 = new WebDriverWait(driver, 60);
		//wait2.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver)
		   // .executeScript("return document.readyState")));
		//org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status
		//from unknown error: unexpected command response
		
		
		//WebDriverWait wait=  new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mobiles']"))) ;
		
		Thread.sleep(6000);
		
		Actions actions1 = new Actions(driver);
		
		WebElement Mobiles=findElement(By.xpath("//a[text()='Mobiles']"));
		actions1.moveToElement(Mobiles).click().perform();
	
		Thread.sleep(6000);
		//WebDriverWait wait1=  new WebDriverWait(driver,60);
		//wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='A54']"))) ;
		WebElement A54=findElement(By.xpath("//a[@aria-label='A54']"));
		
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(A54).click().perform();
		
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement quantity=findElement(By.xpath("//select[@id='quantity']"));
		js.executeScript("arguments[0].scrollIntoView();", quantity); 
		
		Thread.sleep(6000);
		
		Select dropdown2 = new Select(findElement(By.xpath("//select[@id='quantity']")));
		dropdown2.selectByIndex(1);
		findElement(By.id("add-to-cart-button")).click();
		
		
		//findElement(By.xpath("//span[starts-with(text(),'Proceed to checkout')]")).click();
		//WebElement Proceed_tocheckout=driver.findElement(By.xpath("//span[starts-with(text(),'Proceed to checkout')]"));
		//js.executeScript("arguments[0].click();", Proceed_tocheckout);
		Thread.sleep(5000);
		String str=findElement(By.id("attach-accessory-cart-subtotal")).getText();
		Thread.sleep(5000);
		
		System.out.println("Cart amount is:"+str);
		
		//WebDriverWait wait=  new WebDriverWait(driver,60);
		WebElement CART=findElement(By.xpath("//span[text()=' Cart ']"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Cart ']"))) ;
		//js.executeScript("arguments[0].click();", CART);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(CART).click().perform();
		
		 Thread.sleep(5000);
		
		String Price=findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText();
		System.out.println("Price of Oppo : "+Price);
		
		float fprice=getFloat_From_String(Price);
		System.out.println("Actual Price in Float :"+fprice);
		
		String Quantity=findElement(By.className("a-dropdown-prompt")).getText();
		System.out.println("Quantity Oppo : "+Quantity);
		
		float fQuantity=getFloat_From_String(Quantity);
		System.out.println("Actual Quantity in Float :"+fQuantity);
		
		float Total_Cart_Amount=(float) ((fprice)*(fQuantity));
		
		
		System.out.println("Actual Total_Cart_Amount in Float :"+Total_Cart_Amount);
		
		
		
		
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
