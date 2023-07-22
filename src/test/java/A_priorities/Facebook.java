package A_priorities;

import org.testng.annotations.Test;

public class Facebook {
	
	
  @Test(priority=-1)
  public void Signup() 
  {
	  System.out.println("Signup");
  }
  
  @Test()
  public void Login() 
  {
	  System.out.println("Login");
  }
  
  @Test(priority=2)
  public void Activity() 
  {
	  System.out.println("Activity");
  }
  
  @Test(priority=3)
  public void Logout() 
  {
	  System.out.println("Logout");
  }
  
  @Test()
  public void Login123() 
  {
	  System.out.println("Login123");
  }
}
