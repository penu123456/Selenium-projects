package Amazon4;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import Reporter_Example_Word.ImageAttachmentInDocument1;
import Reporter_Example_Word.Reporter1;

public class Amazon_Verification {
	
	 WebDriver driver;
	
	 String str;
	 Reporter1 R1;
	 ImageAttachmentInDocument1 IA1;
	 
	   String FullNAme="//input[@id='address-ui-widgets-enterAddressFullName']";
	   String yes="//input[@class='a-button-input']";

	 	
	public void  Amazon_Verification(WebDriver driver,Reporter1 R1 , ImageAttachmentInDocument1 IA2)throws Exception
	{  
		this.driver=driver;
		this.R1=R1;
		this.IA1=IA2;
	}
	
	
	public void Verify_Address(String straddressname)throws Exception
	{
			
		(//span[@id='address-ui-widgets-FullName' and text()='Jyothi Bubbly'])[1]
					
		String verifyaddress="(//span[@id='address-ui-widgets-FullName' and text()='"+straddressname+"'])[1]";
		List<WebElement> Address=driver.findElements(By.xpath(verifyaddress));
		
		if(Address.size()>0)
		{	
			//WebElement ele=findElement(By.xpath(verifyaddress));
			str=R1.TakeScreenShotAuto(driver,"Address Found with specified name ","Pass");
			IA1.PasteImage("Address Found with specified name  ",str);
		
			//String eletext=ele.getText();
			//System.out.println("Address with this name from UI "+eletext);
			//System.out.println("Address with this name "+straddressname);
		}
		else
		{
			str=R1.TakeScreenShotAuto(driver,"Address not Found with specified name ","Fail");
			IA1.PasteImage("Address not Found with specified name  ",str);
		}

	
		  
	}
	
	public void Modify_Specific_Address(String straddressname,String fullname1)throws Exception
	{
		
		
		
		String ModifyAddressbtn="(//span[@id='address-ui-widgets-FullName' and text()='"+straddressname+"'])[1]//following::a[2]";

		
		findElement(By.xpath(ModifyAddressbtn));
		//str=R1.TakeScreenShotAuto(driver,"Modifying "+straddressname+"Address","Pass");
		//IA1.PasteImage("Modifying "+straddressname+"Address",str);
		findElement(By.xpath(ModifyAddressbtn)).click();
		
		findElement(By.xpath(FullNAme)).clear();
		findElement(By.xpath(FullNAme)).sendKeys(fullname1);
		str=R1.TakeScreenShotAuto(driver," Modifying my name","Pass");
		IA1.PasteImage("Modifying my name  ",str);
		
		findElement(By.xpath("//input[@class='a-button-input']"));
		str=R1.TakeScreenShotAuto(driver," SAve the Changes","Pass");
		IA1.PasteImage("Save The Changes",str);
		findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		str=R1.TakeScreenShotAuto(driver,"Address after Modifying","Pass");
		IA1.PasteImage("Address after Modifying",str);
		
		
	}
	
	public void Delete_Specific_Address(String straddressname)throws Exception
	{
		
		/*
		  (//span[@id='address-ui-widgets-FullName' and text()='Jyothi Bubbly'])[1]//following::a[3]
		 
		  (//span[@id='address-ui-widgets-FullName' and text()='I have changed12'])[1]//following::a[3]
		  
		  "(//span[@id='address-ui-widgets-FullName' and text()='"+text+"'])[1]//following::a[3]"
		  
		*/
		
		String deleteaddrsbtn="(//span[@id='address-ui-widgets-FullName' and text()='"+straddressname+"'])[1]//following::a[3]";
		findElement(By.xpath(deleteaddrsbtn));
		str=R1.TakeScreenShotAuto(driver,"Modifying "+straddressname+"Address","Pass");
		IA1.PasteImage("Modifying "+straddressname+"Address",str);
		findElement(By.xpath(deleteaddrsbtn)).click();
		
		Thread.sleep(3000);
		WebElement ele=findElement(By.xpath(yes));
		str=R1.TakeScreenShotAuto(driver,"Click on yes","Pass");
		IA1.PasteImage("Click on yes",str);
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).click().perform();
		
		str=R1.TakeScreenShotAuto(driver,"Address Successfully Deleted","Pass");
		IA1.PasteImage("Address Successfully Deleted",str);
		
	}

	
	public  WebElement findElement(By by) throws Exception 
	{
			Thread.sleep(2000);	
		WebElement elem = driver.findElement(by);  
		Thread.sleep(2000);	

		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='4px solid red'", elem);
	 
		}
		return elem;
	}
	 

}
