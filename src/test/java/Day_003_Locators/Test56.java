package Day_003_Locators;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;


public class Test56 {
	
	
	WebDriver driver=null;
	
  @Test
  public void Test561() throws Exception {
	  
	
	  driver=TestBrowser.OpenChromeBrowser();
	//driver=driver5;
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }
  
  
}
