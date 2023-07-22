package TESTCASE2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PAGES2.LoginPage;
import PAGES2.SkillsPage;
import PAGES2.HomePage;



public class TC01_Add_Skills {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver(); //11112222
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			driver.manage().window().maximize() ;	
			driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	public void Skillsest() throws Exception
	{
		
		LoginPage l1=new LoginPage();
		l1.LoginPage(driver);
		l1.Login("Admin", "admin123");
		
		SkillsPage s1=new SkillsPage();
		s1.SkillsPage(driver);
		s1.AddSkills("Oracle7", "Oracle7 descr");
		
		HomePage h1=new HomePage();
		h1.HomePage(driver);
		h1.Logout();

		
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
	
 
}
