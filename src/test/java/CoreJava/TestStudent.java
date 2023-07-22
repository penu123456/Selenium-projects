package CoreJava;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setSname("RAVI");
		s1.setRollno(12345);
		s1.setContactno(23423342);
		s1.displaystudentdata();
		
		System.out.println("s1 data"+s1.getSname());
		System.out.println("s1 data"+s1.getRollno());
		System.out.println("s1 data"+s1.getContactno());
		
		Student S2=new Student();
		S2.setSname("Kiran");
		S2.setRollno(1223);
		S2.setContactno(12312312);
		S2.displaystudentdata();
		
		System.out.println("s2 data  : "+S2.getSname());
		System.out.println("s2 data : "+S2.getRollno());
		System.out.println("s2 data : "+S2.getContactno());

	}

}
