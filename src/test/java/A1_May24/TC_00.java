package A1_May24;

import org.testng.annotations.Test;

public class TC_00 {
	
	int a,b,c;
	
  @Test
  public void f() {
	  
	  a=5;
	  b=6;
	  c=a*b;
	  
	System.out.println("multiplication of ab"+c) ;
	
  }
}
