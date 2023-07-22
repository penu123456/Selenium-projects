package ABC_Data;

import org.testng.annotations.Test;

public class TC01_Add_Numbers {
	
	
	int a,b,c; //Declaration
	
	 
	
	
  @Test
  public void Add_Sumof_numbers() {
	  
	  a=10;
	  b=20;
	  c=a+b;
	  
	  
	  System.out.println("Value of a is : " +a);
	  System.out.println("Value of b is : " +b);
	  System.out.println("Value of c is : " +c);
  }
  
 
  
}
