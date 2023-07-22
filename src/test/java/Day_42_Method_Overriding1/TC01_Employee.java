package  Day_42_Method_Overriding1;
import ExcelUtil.ExcelApiTest4;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TC01_Employee extends Employee_Contact_Data
{
	WebDriver driver;

	@DataProvider(name = "TC01_Add_Nationality")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_EMP_Overriding.xlsx", "Sheet1");
		
		
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
	
	
	
	
	@Test(dataProvider = "TC01_Add_Nationality")
	public void Test1(String FirstName,String LastName,String ContactAddress) throws Exception {
		
	
	
		
		if(ContactAddress.equals(""))
		{
			Employee_Contact_Data E1=new Employee_Contact_Data();
			E1.create_contact_Address(FirstName, LastName, ContactAddress);
			
		}
		else
		{
			create_contact_Address(FirstName, LastName, ContactAddress);
		}
		
	}
	

	public  void create_contact_Address(String firstName1, String lastName1, String contactAddress1) {
		
		System.out.printf("CFirst Name: %s \t CLast Name: %s   \t CcontactAddress : %s \n",firstName1, lastName1 , contactAddress1);
	}
	
		
	 
	
}












