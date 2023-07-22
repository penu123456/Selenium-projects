package A_TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
 
  @Override
  public void onTestStart(ITestResult result) {
	  
	  System.out.println("On test start:"+result.getName());
	 // Reporter.log("On test start:" +result.getName());
	
  }

  @Override
  public void onTestSuccess(ITestResult result) {
	System.out.println("The test is success");
  }

  @Override
  public void onTestFailure(ITestResult result) {
	  
	System.out.println("The test failed is :"+result.getName());
	
  }

  @Override
  public void onTestSkipped(ITestResult result) {
	
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
  }

  @Override
  public void onStart(ITestContext context) {
	  
	  System.out.println("The context is :"+context.getName());
	
  }

  @Override
  public void onFinish(ITestContext context) {
	  
	  System.out.println("The context is :"+context.getName());
	
  }
}
