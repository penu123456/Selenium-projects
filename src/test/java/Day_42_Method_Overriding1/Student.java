package Day_42_Method_Overriding1;

import org.testng.annotations.Test;

public class Student extends Human {
	
	public void Address()
	{
		System.out.println("Hai I am from Hyderabad my personal address");
	}
	
	@Test
	public void Test1()
	{
		/*Student st=new Student();
		st.Address();
		*/
		
		/*Human h1= new Human();
		h1.Address();*/
		
		Address();
	}
}
