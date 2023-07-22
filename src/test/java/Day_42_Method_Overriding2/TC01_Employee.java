package  Day_42_Method_Overriding2;

/*
OOPs Concepts – Table of Contents
1. What is an Object
2. What is a class
3. Constructor in Java
4. Object Oriented Programming Features
		4.1 Abstraction (class)
		4.2 Encapsulation
		4.3 Inheritance
		4.4 Polymorphism (Method Overloading / Method Overriding)
		
5.Abstract Class and Methods
6.Interfaces in Java
*/

//https://beginnersbook.com/2013/04/oops-concepts/#3


public class TC01_Employee
{  
		
		 // Non Static members
		 int rollno;
		 String contact_number;  
		 String name; 
		 
		 static String college = "VBIT College Atonomous";
		 static String college_contact_number = "08647-232433";
		 
		 TC01_Employee()
		 {
			 System.out.println("Just Object created ,but not assigned any values");
		 }  
	 

		 //Method Name is same as class name , hence the below method is called as Constructor 
		 // Constructor is used to  initialize object values 
		 TC01_Employee(int rollno1, String name1,String contact_number)
		 {  
		 this.rollno = rollno1;  
		 this.name = name1;  
		 this.contact_number = contact_number; 
		 
		// college = "VBIT College Atonomous";
		// college_contact_number = "08647-232433";
		 
		 }  

		 
		// Non static method 
		public void display () throws Exception
		{
			System.out.println("rollno          			: "+rollno);
			System.out.println("contact_number  			: "+contact_number);
			System.out.println("name            			: "+name);
			System.out.println("college 				: "+college);
			System.out.println("college_contact_number 			: "+college_contact_number);
			System.out.println("____________________________________________________");
		}  
		
		
		

		
		//Program Execution starts from main methods in any Java program
		public static void main(String args[]) throws Exception{  
		{
			// S1,S2,S3 objects created with data
			TC01_Employee s1 = new TC01_Employee (111,"Sudhakar","9294052778"); 
			s1.display(); 
			//s1.Student_College_Data();
			
			//Student s2 = new Student (222,"Rithika","9493148336");  
			//Student s3 = new Student (333,"Dharmaja","9381196841");  
			
			TC01_Employee s4 = new TC01_Employee (); 
			s4.display();  
			//s2.display();  
			//s3.display();  
		}  
		
		
		}
		
}