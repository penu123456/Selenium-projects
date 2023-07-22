package ABC_Demo112;

import org.testng.annotations.Test;

public class TC01_Addition {
	
	int a,b,c;  //Declaration 
	
	
	
  @Test
  public void Addition() {
	  
	
	  int p;
	  p=10;
	  p=sum(10,20);
	  
	  System.out.println(" Sum of two numbers result is : "+p); 
	  
  }
  
  public int sum(int a,int b)
  {
	  
	  int sum=a+b;
	  System.out.println("result :"+sum);
	return sum;
	  
  }
  
  
  
  
}
