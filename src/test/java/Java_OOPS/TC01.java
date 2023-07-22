package Java_OOPS;



public class TC01 {

	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		s1.StudentData();
		
		s1.setSno(100);
		s1.setSname("Ravi");
		s1.setScontact(34234234);
		
		s1.StudentData();
		
		//System.out.println("S1 Data :"+s1.getSno());
		//System.out.println("S1 Data :"+s1.getSname());
		//System.out.println("S1 Data : "+s1.getScontact());
		
	}

}
