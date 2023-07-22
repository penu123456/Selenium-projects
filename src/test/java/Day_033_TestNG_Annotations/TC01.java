package Day_033_TestNG_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class TC01 {
	
	
  @Test
  public void f() {
	  
	  System.out.println("Five");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Four");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Three");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Two");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("one");
  }

}
