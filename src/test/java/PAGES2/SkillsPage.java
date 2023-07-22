package PAGES2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SkillsPage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[1]")
	WebElement ADMIN;
	
	@FindBy(xpath="//span[text()='Qualifications ']")
	WebElement QUALIFICATIONS;
	
	@FindBy(xpath="//a[text()='Skills']")
	WebElement SKILLS;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement ADDBUTTON;

	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement SKILLNAME;

	@FindBy(xpath="//textarea[ @placeholder='Type description here']")
	WebElement SKILLDESCR;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement SAVEBUTTON;
		
	
	
	
	
	
	public void SkillsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddSkills(String SkillName,String SkillDescr) throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ADMIN.click();
		QUALIFICATIONS.click();
		SKILLS.click();
		ADDBUTTON.click();
		SKILLNAME.sendKeys(SkillName);
		SKILLDESCR.sendKeys(SkillDescr);
		Thread.sleep(5000);
		SAVEBUTTON.click();
	
	
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
