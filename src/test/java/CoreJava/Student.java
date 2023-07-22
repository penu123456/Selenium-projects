package CoreJava;

public class Student {
	
	int Rollno,contactno;
	String sname;
	
	
	public int getRollno() {
		return Rollno;
	}
	
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	
	public int getContactno() {
		return contactno;
	}
	
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public void displaystudentdata()
	{
		System.out.println("Name :"+sname);
		System.out.println("Rollno :"+Rollno);
		System.out.println("contactno :"+contactno);
		System.out.println("______________________________");
	}
	
	

}
