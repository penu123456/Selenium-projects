package ABC_Demo113;

public class Student1 {
	
	int SNO,CONTACTNO;
	String SNAME;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student1 s1=new Student1("RAVI",10,1232312);
		Student1 s2=new Student1("KIRAN",20,21312);
		Student1 s3=new Student1();
		
	}

	
	Student1(){
		
		System.out.println("default constr");
	}
	
	Student1(String sname,int sno,int contactNo){
		
		this.SNAME=sname;
		this.SNO=sno;
		this.CONTACTNO=contactNo;
	}
	
	
}
