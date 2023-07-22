package ABC_Demo20;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class NewTest {
	
 WebDriver driver;
	
  @Test
  public void LoginTest() throws Exception {
	  
	  
	  driver=TestBrowser.OpenChromeBrowser();
	  
	  //driver=driver5;
	  
	 // driver.get("");
	  
	  
	  int sim;
	  
		 
		sim=TestBrowser.simpleInterestcal(10000,2,10);
		  
		  System.out.println (" Simple interest result  is :" +sim);

	  
  }
  
  
}
