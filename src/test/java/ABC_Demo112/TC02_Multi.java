package ABC_Demo112;

import org.testng.annotations.Test;

public class TC02_Multi {
	
	int a,b,c;  //Declaration 
	
  @Test
  public void multiplication() {
	  
	  a=10;
	  b=20;
	  c=a*b;
	  
	  System.out.println(" product of two numbers result is : "+c); 
	  
  }
  
  
}
