package A_Groups;

import org.testng.annotations.Test;


@Test(groups="AllTests")
public class NewTest2 {
  
	
	@Test(groups="Smoke")
  public void Test1() 
	{
		
		System.out.println("Test1");
    }
	
	@Test(groups= {"Smoke","Sanity"})
	  public void Test2() 
		{
		System.out.println("Test2");
			
	    }
	
	@Test(groups="Regression")
	  public void Test3() 
		{
			
		System.out.println("Test3");
	    }
	
	@Test
	  public void Test4() 
		{
		System.out.println("Test4");
			
	    }
}
