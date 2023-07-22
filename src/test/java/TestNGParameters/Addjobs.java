package TestNGParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addjobs {
	
	WebDriver driver;
	
  @Test
  @Parameters({"browser","url","username","password","jobtitle","jobdesc","jobnote"})
  public void add_jobs(String browser1,String testurl,String username1,String password1,String jobtitle1,String jobdesc1,String jobnote1) throws Exception 
	{
		Addjobs aj=new Addjobs();
		aj.openbrowser(browser1);
		aj.openurl(testurl);
		aj.login(username1,password1);
		aj.jobdata(jobtitle1,jobdesc1,jobnote1);
    }
	
	public void openbrowser(String browser1) {
		
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
	
	public void openurl(String testurl) {
		
		driver.get(testurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
    public void login(String username1, String password1) {
		
    	driver.findElement(By.name("username")).sendKeys(username1);
    	driver.findElement(By.name("password")).sendKeys(password1);
    	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
	}
	
	public void jobdata(String jobtitle1, String jobdesc1, String jobnote1) throws Exception {
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(jobtitle1);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(jobdesc1);
		driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(jobnote1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
		
		
		
	}
}
