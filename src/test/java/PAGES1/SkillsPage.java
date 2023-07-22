package PAGES1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SkillsPage {
	
	
	WebDriver driver; // o or null , null pinter except
	
	public void SkillsPage(WebDriver driver) //driver=1111222;
	{
		this.driver=driver;  
	}
	
	public void AddSKills(String SkillName,String SkillDescr) throws Exception
	{
		//AddSkills
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
				findElement(By.xpath("//span[text()='Qualifications ']")).click();
				findElement(By.xpath("//a[text()='Skills']")).click();
				findElement(By.xpath("//button[text()=' Add ']")).click();
				findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
				findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(SkillDescr);
				
				Thread.sleep(5000);
				findElement(By.xpath("//button[text()=' Save ']")).click();
	}
	
	
	
	public void ModifySKills(String oldSkillName,String oldSkillDescr,String newSkillName,String newSkillDescr) throws Exception
	{
		
	}
	
	
	public void DeleteSKills(String SkillName,String SkillDescr) throws Exception
	{
		
	}
	
	
	
	
	
	public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	} 
	
	
 
}
