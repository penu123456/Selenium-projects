package TESTCASES3;

import org.testng.annotations.Test;

import PAGES3.HomePage;
import PAGES3.JobsPage;
import PAGES3.LoginPage;
import PAGES3.SkillsPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test2_jobs {
	
	WebDriver driver;
	
	
 @BeforeTest
  public void OpenChromeBrowswer() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();  //driver=117
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  
  @Test
  public void MainTest() throws Exception {
	  
	 LoginPage l1=new LoginPage();
	 l1.LoginPage(driver);
	 l1.Login();
	 
	 JobsPage j1=new JobsPage();
	 j1.JobsPage(driver);
	 j1.AddJobs();
	 
	 HomePage h1=new HomePage();
	 h1.HomePage(driver);
	 h1.Logout();
	  
  }
  
  

  @AfterTest
  public void closeBrowser() {
	  
	  driver.close();
	  
  }
  

}
