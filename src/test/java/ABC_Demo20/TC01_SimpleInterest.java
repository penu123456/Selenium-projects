package ABC_Demo20;

import org.testng.annotations.Test;

import CommonUtil.TestBrowser;


public class TC01_SimpleInterest {
	

	
  @Test
  public void SimTest() throws Exception {
	  
	  int sim;
	  
	 
	sim=TestBrowser.simpleInterestcal(10000,2,10);
	  
	  System.out.println (" Simple interest result  is :" +sim);

	  
  }
  
  
 
  
  
  
}
