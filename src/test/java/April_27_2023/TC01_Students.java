package April_27_2023;

public class TC01_Students {

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		
		s1.setSno(10);
		s1.setSname("Ravi");
		s1.setSaddress("Hyderabad - Gachibowlo - Telangana");
		
		
		System.out.println(s1.getSno());
		System.out.println(s1.getSname());
		System.out.println(s1.getSaddress());
		
		
		Student s2=new Student();
		
		s2.setSno(100);
		s2.setSname("Chandra");
		s2.setSaddress("Hyderabad - Miyapur - Telangana");
		
		
		System.out.println(s2.getSno());
		System.out.println(s2.getSname());
		System.out.println(s2.getSaddress());
		
		
		
		Contact c1=new Contact();
		
		c1.setFname("Sudhakar");
		c1.setLname("Th");
		c1.setMobilenumber(929929);
		
		System.out.println(c1.getFname());
		System.out.println(c1.getLname());
		System.out.println(c1.getMobilenumber());
		
		
		
		
		
		
		
		
		
		
	

	}

}
