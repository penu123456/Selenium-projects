package Java_Polymorphysim;

public class Employee {

	
	
	public static void main(String[] args) throws Exception {
		

		
		Employee e1=new Employee();
		e1.serachEmployee(10.50);
		e1.serachEmployee(1012,"Full Time");
		e1.serachEmployee(1012,"Full Time","Kiran");

	}
	
	
	public void serachEmployee(double d)throws Exception
	{
		System.out.println("Employee double id is:" +d);
	}
	

	
	
	public void serachEmployee(int Employeeid,String EmployeeStatus)throws Exception
	{
		System.out.println("Employee id is:" +Employeeid);
		System.out.println("EmployeeStatus is:" +EmployeeStatus);
	}
	
	public void serachEmployee(int Employeeid,String EmployeeStatus,String EmployeeName)throws Exception
	{
		System.out.println("Employee id is:" +Employeeid);
		System.out.println("EmployeeStatus is:" +EmployeeStatus);
		System.out.println("EmployeeName  is:" +EmployeeName);

	}
	
	
	
	

}
