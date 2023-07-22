package Day_43_Smart_Search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC014_Startswith {
	
	WebDriver driver;
	

	//String Nationality_xpath1 ="//*[starts-with(text(),'Nationalities')]";
	
	//String Nationality_xpath ="//*[starts-with(@id,'menu_admin_nationality')]";
	
	

		String Google_Input_text="//input[@class='gLFyf gsfi' and @name='q']";
	
		//String KeyWordText ="//*[starts-with(text(),'selenium')]";
		String KeyWordText ="//span[starts-with(text(),'selenium')]//following-sibling::b";
		
		

	@Test
	public void Test1()throws Exception
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		findElement(By.xpath(Google_Input_text)).sendKeys("selenium") ; 
		
	    List<WebElement>   Elements = driver.findElements(By.xpath(KeyWordText));
	    
	   // int count=Elements.size();
	    
	   // System.out.println("total names"+count);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;		
	    
	    for(WebElement element:Elements)
	    {
	    	
	    	System.out.println(element.getText());
	    	
	    	js.executeScript("arguments[0].style.border='3px solid red'", element);
	    	
	    	String str=element.getText();
	    	
	    	//System.out.println(str);
	    	
	    	if(str.equals("tutorial"))
	    	{
	    		element.click();
	    		break;
	    	}

	    }


	    
	    
	  /*  for ( int i=0 ; i<Elements.size() ;i++)  // i=1;  i<=10 ; i=i+1
	    {
	   
	      		  
	      		  String str1="//*[starts-with(text(),'selenium')]//following-sibling::b["  + i +  "]";
	      	
	    		    WebElement element=findElement(By.xpath(str1));
	    		    Thread.sleep(500);
	    		   
	    	       String WebElementText = element.getText();
	    	       
	    	       System.out.println("Get Text Value is from the WebElement: " + WebElementText);
	    	       
	    	       js.executeScript("arguments[0].style.border='3px solid red'", element);
	   	    	/*String str=element.getText();
	   	    	
	   	    	if(str.equals("seleniumhq"))
	   	    	{
	   	    		element.click();
	   	    		break;
	   	    	}*/
	    	
	   // }     */
	    	       

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
