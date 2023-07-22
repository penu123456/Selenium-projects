package Day044_Return_Values;

import java.util.Scanner;

public class TC001_Return_Single_Value2 {
	
	

	public static void main(String[] args) {
		

		
		/*Scanner c1 = new Scanner(System.in);
		System.out.println("enter x1 ");
		int x1=c1.nextInt();
		System.out.println("enter y1 ");
		int y1=c1.nextInt();
		*/
		
		TC001_Return_Single_Value2 h1= new TC001_Return_Single_Value2();
		
		int sum= h1.sum(10,29);
		System.out.println("sum of a,b " +sum);
		System.out.println("___****Sum ****_____" );
		
		
		int mul= h1.multiplication(20,10);
		System.out.println("multiplication of a,b " +mul);
		System.out.println("___****Mul ****_____" );
		

		int sub= h1.subtract(70,60);
		System.out.println("subtract of a,b " +sub);

		int g= h1.division(20,10);
		System.out.println("division of a,b " +g);
		
		int si=h1.simpleinterest(10000,2,10);
		//int si=sim;
		System.out.println("Simple interest is :" +si);
		
		
		
		String str=h1.concatTwoStrings("Hello","Selenium");
		System.out.println(str);
		
		
		int avg=h1.CaculateAverage(10,20,30);
		System.out.println("Averaghe value is:" +avg);
		
		
		boolean flag1=false;
	
		flag1=h1.checkEvenNumberorNot(20);
		
		if(flag1)
		{
			System.out.println(" Given input is Even Number");
		}
		else
		{
			System.out.println(" Given input is not a Even Number");
		}
		
		
		


	}
	

	
	
	public  boolean checkEvenNumberorNot(int i) {
		
		boolean flag=false;
		
		if(i%2==0)
			flag=true;
		else
			flag=false;
			
		return flag;
		
		
	}




	public int CaculateAverage(int i, int j, int k) {
		
		int avg1=(i+j+k)/3;
		
		return avg1;
	}




	public String concatTwoStrings(String string1, String string2) {
		
		String str3=string1+" "+string2;
		
		// TODO Auto-generated method stub
		return str3;
	}




	public int simpleinterest(int p, int t, int r) {
		
		int sim=(p*t*r)/100;
		return sim;
		
	}




	//method with arguements
	public int sum(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int d=a+b;
	
	//System.out.println("Sum of a,b " +d);
	
	return d;
	}
	
	
	

	//method with arguements
	public int multiplication(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int d=a*b;
	
	
	return d;
	}
	

	

	//method with arguements
	public int subtract(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int f=a-b;
	
	//System.out.println("Sum of a,b " +d);
	
	return f;
	}
	
	
	
	

	//method with arguements
	public int division(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int f=a/b;
	
	
	
	return f;
	}
	
	

}
