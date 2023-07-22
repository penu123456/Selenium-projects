package Day_42_Method_Overriding1;

public class Employee_Contact_Data {
	

	public  void create_contact_Address(String firstName1, String lastName1, String contactAddress1) 
	{
		
		if(contactAddress1.equals("")) 
		{
			contactAddress1="Gachibowli_Hyderabad";
			System.out.printf("SFirst Name: %s \t SLast Name: %s  \t ScontactAddress : %s \n",firstName1, lastName1 , contactAddress1);
		}
		else
		{
			System.out.printf("SFirst Name: %s \t SLast Name: %s  \t ScontactAddress : %s \n",firstName1, lastName1 , contactAddress1);
		}
		
	}
	


}
