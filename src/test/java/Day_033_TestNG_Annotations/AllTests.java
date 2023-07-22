package  Day_033_TestNG_Annotations;
//https://www.guru99.com/all-about-testng-and-selenium.html

import org.testng.annotations.*;
public class AllTests
{
	
	@BeforeSuite
	public void Test1() throws Exception {
		
		System.out.println("Test1");
	}
	
	
	@BeforeTest
	public void Test3() throws Exception {
		System.out.println("Test3");
	}
	
	@BeforeClass
	public void Test2() throws Exception {
		
		System.out.println("Test2");
	}

	

	
	@Test
	public void MainTest() throws Exception {
		System.out.println("@Test99");
	}
	
	@Test
	public void Test100() throws Exception {
		System.out.println("Test100");
	}
	
	
	
	@AfterClass
	public void Test6() throws Exception {
		System.out.println("Test6");
	}
	
	@AfterTest
	public void Test5() throws Exception {
		System.out.println("Test5");
	}
	
	
	@AfterSuite
	public void Test7() throws Exception {
		
		System.out.println("Test7");
	}
		
	
	@BeforeMethod
	public void Test8() throws Exception {
		System.out.println("Test8");
	}
	
	@AfterMethod
	public void Test9() throws Exception {
		
		System.out.println("Test9");
	}
	
	
}                                                  












