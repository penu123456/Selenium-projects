package Day_029_PageObjectModel3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import CommonUtil.TestBrowser;

public class TC01 {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();  //driver=1101
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage L1 = new LoginPage();
		L1.LoginPage(driver);
		L1.Login();
		
		Nationalities N1= new Nationalities();
		N1.Nationalities(driver);
		N1.AddNationality();
		
		HomePage H1= new HomePage();
		H1.HomePage(driver);
		H1.Logout();
		
		driver.quit();

	}

}
