package Amazon4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Covid_cases {
	
	WebDriver driver;
	
  @Test
  public void Test1() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver",	"C:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.worldometers.info/coronavirus/");
	  
	  Thread.sleep(6000);
	  
	  List<WebElement> CountryName=driver.findElements(By.xpath("//*[@id='main_table_countries_today']/tbody[1]/tr/td[2]/a"));
	  

	  for(int i=0;i<CountryName.size();i++)
	  {


	  String str=CountryName.get(i).getText();

	  
	
	  if(str.length()>0)
	  {

	  	//System.out.println(str);
	  	
	  	//String str4="(//a[text()='USA'])[1]//following::td[1]";
	  	
		String TotalCasesXpath="(//a[contains(text(),'" + str +"')])[1]//following::td[1]";
		String TotalCases=driver.findElement(By.xpath(TotalCasesXpath)).getText();
		
		String TotalDeathCasesXpath="(//a[contains(text(),'" + str +"')])[1]//following::td[3]";
		String TotalDeathCases=driver.findElement(By.xpath(TotalDeathCasesXpath)).getText();
		
		
		System.out.println("Country Name  :"+str);
		System.out.println("Total Cases :"+TotalCases);
		System.out.println("Total Death Cases :"+TotalDeathCases);
		System.out.println("________________________");
		
		  
	  }
	  
	  
	  
	  
	  }
	  
  }
}
  
  
  

