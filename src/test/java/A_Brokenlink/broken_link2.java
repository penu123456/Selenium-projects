package A_Brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class broken_link2 {
	WebDriver driver;
  @Test
  public void sample() throws IOException {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links present are:"+ links.size());
		
		for(WebElement link:links)
		{
			String hurl=link.getAttribute("href");
			URL url=new URL(hurl);
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			
			conn.setConnectTimeout(3000);
			
			int response=conn.getResponseCode();
			if(response>=400)
			{
				System.err.println("This link is an invalid link:"+conn.getResponseMessage());
			}
			
			else
			{
				System.out.println("The link is a valid link:"+conn.getResponseMessage());
			}

        }
    }
}
