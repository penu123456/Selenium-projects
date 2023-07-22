package A2_May16;

import org.testng.annotations.Test;

public class TC02 {
	
	
	int a,b,c,d;  //Declaration
	
	
  @Test
  public void MainTest1() {
	  
	  a=10;
	  b=20;
	  c=a+b;

	  
	  System.out.println(" sum of ab : -  "+c);

	  
  }
  
  
  @Test
  public void MainTest2() {
	  
	  a=10;
	  b=20;
	  d=a*b;
	  System.out.println(" Mutilplication of ab : -  "+d);
	  
  }
  
  
  
  
  
}
