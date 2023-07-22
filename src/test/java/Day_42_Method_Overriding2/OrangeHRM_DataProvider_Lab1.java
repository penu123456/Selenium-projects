package  Day_42_Method_Overriding2;
import CommonUtil.*;
import org.openqa.selenium.JavascriptExecutor;
import ExcelUtil.ExcelApiTest4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class OrangeHRM_DataProvider_Lab1
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
		
		
		
	}
	
	
	
	
	
		
	 
	
}












