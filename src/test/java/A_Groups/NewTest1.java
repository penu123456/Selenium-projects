package A_Groups;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void Test5() 
  {
	  System.out.println("Test5");
  }
  
	@Test(groups="Regression")
	  public void Test6() 
		{
		System.out.println("Test6");
			
	    }
	
	@Test(groups= {"Smoke","Regression"})
	  public void Test7() 
		{
		System.out.println("Test7");
			
	    }
	
	@Test(groups="Sanity")
	  public void Test8() 
		{
		System.out.println("Test8");
			
	    }
}
