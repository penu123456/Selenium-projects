package April_27_2023;

public class Student1 {

	
	int smobile;
	String firstname;
	String lastname;
	
	public static void main(String[] args) {
		
		
		Student1 s1=new Student1();
		s1.studentData();
		
		
		Student1 s2=new Student1(4444,"Ravi","abc");
		s2.studentData();

	}
	
	Student1()  //Default constrctor
	{
		this.smobile=0;
		this.firstname="Pending";
		this.lastname="Pending";
	}
	
	Student1(int smobile1,String fname,String lname)  //Constrctor with parameters
	{
		this.smobile=smobile1;
		this.firstname=fname;
		this.lastname=lname;
	}
	
	
	
	
	
	public void studentData()
	{
		System.out.println("smobile-"+smobile);
		System.out.println("firstname-"+firstname);
		System.out.println("lastname-"+lastname);
	}
	
	

}
