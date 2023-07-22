package TestNGParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addskills {
	WebDriver driver;
	
  @Parameters({"browser","url","username","password","skillname","skilldesc"})
  @Test
  public void add_skills(String browser1,String url1,String username1,String password1,String skillname1,String skilldesc1) throws Exception 
  {
		Addskills as=new Addskills();
		as.openbrowser(browser1);
		as.openurl(url1);
		as.login(username1,password1);
		as.skilldata(skillname1,skilldesc1);
  }
	
   public void openbrowser(String browser1)
   {
	   if (browser1.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		if(browser1.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://FireFoxDriver//geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		
		
	}
    public void openurl(String url1)
    {

		driver.get(url1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
     }

    public void login(String username1, String password1) 
     {
    	driver.findElement(By.name("username")).sendKeys(username1);
    	driver.findElement(By.name("password")).sendKeys(password1);
    	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
     }
    
	public void skilldata(String skillname1, String skilldesc1) throws Exception 
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Skills']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(skillname1);
		driver.findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(skilldesc1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.quit();
	  
		
	}
	
	
	
}
