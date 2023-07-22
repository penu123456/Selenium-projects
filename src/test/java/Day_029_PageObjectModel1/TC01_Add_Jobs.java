
package  Day_029_PageObjectModel1;
import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
public class TC01_Add_Jobs
{
	WebDriver driver;
	
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
	
	

@DataProvider(name = "TC01_Sample")
public static Object[][] Authentication1() throws Exception {

	ExcelApiTest4 eat = new ExcelApiTest4();
	Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Jobs.xlsx", "Sheet1");
	System.out.println(testObjArray.length);
	return (testObjArray);
}

	
	@Test(dataProvider = "TC01_Sample")
	public void Test3(String TestURL,String UserName,String Password,
			String JobTitle,String JobDescr,String JobNote) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		LoginPage L1 = new LoginPage();
		L1.LoginPage(driver);
		L1.Login(UserName,Password);
		
		Jobs j1=new Jobs();
		j1.Jobs(driver);
		j1.AddJobs(JobTitle, JobDescr, JobNote);
		
		HomePage H1= new HomePage();
		H1.HomePage(driver);
		H1.Logout();
	}
	
	@AfterTest 
	public void  TestCloser()throws Exception {	
		driver.quit();
	}
	
	
	
}












