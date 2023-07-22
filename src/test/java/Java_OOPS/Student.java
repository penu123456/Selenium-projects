package Java_OOPS;

public class Student {
	
	int Sno,Scontact;
	String Sname;
	static String CollegeName="JNTU",CollgeAddress="HYDERABAD";
	
	
	Student(){
		
		System.out.println("Default Constrctor");
	}
	
	Student(int Sno,int Scontact,String Sname){
		
		this.Sno=Sno;
		this.Scontact=Scontact;
		this.Sname=Sname;
		
		System.out.println("Parameterized Constrctor");
	}
	
	public void StudentData() {
		
		System.out.println("Student Name :"+Sname);
		System.out.println("Student No :"+Sno);
		System.out.println("Student Contact No :"+Scontact);
		System.out.println("CollegeName Name :"+CollegeName);
		System.out.println("CollgeAddress Name :"+CollgeAddress);
		
		System.out.println("------------------------");
		
	}

	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.StudentData();
		
		Student s2=new Student(100,1323123,"Ravi");
		s2.StudentData();
		
		Student s3=new Student(300,1333123,"Kiran");
		s3.StudentData();

	}

}
