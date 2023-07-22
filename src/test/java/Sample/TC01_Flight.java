package Sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Flight {
	
	WebDriver driver; //Declaration
	
  @Test
  public void Login_Test() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights/international/results?adults=1&childs=0&infants=0&class=Economy&depart_date=28/04/2023&from=BLR&to=DXB&intl=y&origin=BLR%20-%20Bangalore,%20IN&destination=DXB%20-%20Dubai,%20AE&sd=1674548576165&rnd_one=O&sourceCountry=Bangalore&destinationCountry=Dubai&sft=");
		
		List<WebElement> FlightDetails=driver.findElements(By.className("c-neutral-700 td-none fs-2 mt-1"));
		
		int count=1;
		
		for(WebElement Flight : FlightDetails)
		{

			if(count==1 || count %3==0)
			{
				System.out.println("Every 3rd flight detail is :"+Flight.getText());
	
			}
			count++;
			
			
		}
	  
  }
  
  
}
