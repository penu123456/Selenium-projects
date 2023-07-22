package A_Date_picker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Makemytrip {
	
	WebDriver driver;
	String month_year="December 2023";
	String day="14";
  @Test
  public void f() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("https://www.makemytrip.com/");
	  
	  driver.findElement(By.xpath("//label[@for='departure']")).click();
	  
	 while(true)
	  {
	  String my=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
	  System.out.println(my);
	  if(my.equals(month_year))
	  {
		  break;
	  }
	  else
	  {
		 driver.findElement(By.xpath("(//span[@role='button'])[2]")).click(); 
		 Thread.sleep(3000);
	  }
	  }
	 driver.findElement(By.xpath("(//div[@class='DayPicker-Body'])[1]//p[text()="+day+"]")).click();
  }
}
