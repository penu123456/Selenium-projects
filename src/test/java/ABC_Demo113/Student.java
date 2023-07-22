package ABC_Demo113;

public class Student {
	
	int SNO,CONTACTNO;
	String SNAME;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
		Student s2= new Student("Ravi",10,21312);
		Student s3= new Student("Kiran",20,1123);
	}
	
     Student(){
    	 
    	 System.out.println("Default Constructor");
     }
	
     Student(String sname,int sno,int CoontactNO){
    	 
    	 this.SNO=sno;
    	 this.CONTACTNO=CoontactNO;
    	 this.SNAME=sname;
    	 
     }
     
     Student(String sname,int sno){
    	 
    	 
     }
     
     public void Displaystudentdata()
     {
    	 System
     }
	

}
