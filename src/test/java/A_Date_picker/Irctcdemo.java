package A_Date_picker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Irctcdemo {
	
	WebDriver driver;
	String month_year="August2023";
	String day="18";
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("https://www.irctc.co.in/nget/train-search/");
	  
	  driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
	  
	 
	  //System.out.println(month);
	  
	  Thread.sleep(3000);
	  while(true)
	  {
		  String text= driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']")).getText();
		  if(text.equals(month_year))
		  {
			  break;
		  }
		  else
		  {
			  driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			  Thread.sleep(3000);
		  }
	  }
	  
	  driver.findElement(By.xpath("//a[text()="+day+"]")).click();
	  
	 /* List<WebElement> dates=driver.findElements(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted']"));
	  
	  for(WebElement date:dates)
	  {
		  if(date.getText().equals(day))
		  {
			  date.click();
			  break;
		  }
	  } */  
  }
}
