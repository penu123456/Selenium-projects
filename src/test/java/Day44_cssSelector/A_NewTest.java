package Day44_cssSelector;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_NewTest {
	
	WebDriver driver;
  @Test
  public void CSS() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute"));
		
		
		driver.findElement(By.cssSelector("input[id^=searchtextbox]")); // Suffix is fixed  //tagname[attribute^=staticvalue]                  
	    driver.findElement(By.cssSelector("input[id$=tabsearch]")); // prefix is fixed //tagname[sttribute$=staticvalue]
		driver.findElement(By.cssSelector("[input*='twotab']")); // Partial match //tagname[attribute*='repeating text']
  }
}
