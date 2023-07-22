package  RestAssured1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import io.restassured.RestAssured;
import  io.restassured.response.Response;

public class jacksonMain
{
	
	
	@Test
	public void FirstExample()throws Exception {
		
	/*WebDriver driver;
	driver=TestBrowser.OpenChromeBrowser();	
	driver.get("http://ergast.com/api/f1/2017/circuits.json");
		
		Thread.sleep(2000);*/
		 String output = "";
		Response resp=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		Thread.sleep(3000);
		

		
		String str1="SudhakarT";
		System.out.println("Response data  is :"+str1);
		System.out.println("JSON is "+resp.asString());
		


	//	 driver.quit();
	
		
	}
		
}
		
		
	