package Java_OOPS;

public class Student1 {
	
	private int Sno,Scontact;
	private String Sname;
	
	static String CollegeName="JNTU",CollgeAddress="HYDERABAD";
	
	public int getSno() {
		return Sno;
	}
	
	public void setSno(int sno) {
		Sno = sno;
	}
	
	public int getScontact() {
		return Scontact;
	}
	
	public void setScontact(int scontact) {
		Scontact = scontact;
	}
	
	public String getSname() {
		return Sname;
	}
	
	public void setSname(String sname) {
		Sname = sname;
	}
	
	public void StudentData() {
		
		System.out.println("Student Name :"+Sname);
		System.out.println("Student No :"+Sno);
		System.out.println("Student Contact No :"+Scontact);
		System.out.println("CollegeName Name :"+CollegeName);
		System.out.println("CollgeAddress Name :"+CollgeAddress);
		
		System.out.println("------------------------");
		
	}

}
