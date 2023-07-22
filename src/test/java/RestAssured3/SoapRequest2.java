package RestAssured3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest3;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.io.IOUtils;

public class SoapRequest2 
{
	

	//https://sqa.stackexchange.com/questions/28360/using-rest-assured-library-for-testing-soap-webservices
	
	
	@Test
	public void postMethod() throws Exception {


	        FileInputStream fileInputStream = new FileInputStream(new File("SoapRequestFile.xml"));
	         RestAssured.baseURI="http://currencyconverter.kowabunga.net";
	         
	         RequestSpecification request = RestAssured.given();
	         
	 		Response response = null;

	        // Response response=RestAssured.given()
	         request.header("Content-Type", "text/xml");
	         request.body(IOUtils.toString(fileInputStream,"UTF-8"));
	         
	         String StringFromInputStream = IOUtils.toString(fileInputStream,"UTF-8");
	         System.out.println(StringFromInputStream);

	 		response = request.post("/converter.asmx");  
	 		
	 		int statusCode = response.getStatusCode();
			System.out.println("The status code recieved: " + statusCode);
			System.out.println("Response body: " + response.body().asString());
	      

	        XmlPath jsXpath= new XmlPath(response.asString());//Converting string into xml path to assert
	        String rate=jsXpath.getString("GetConversionRateResult");
	        System.out.println("rate returned is: " +  rate);
	        
	        
	     /* One way to assert
	        String responseString = response.asString();
	        String vendorName = new XmlPath(responseString).getString("Envelope.Body.Vendor.name");
	        System.out.println("vendorName is: " +  vendorName);
	        //assertThat(vendorName,("John Smith"));

	     
	        vendorName = XmlPath.with(responseString).get("Envelope.Body.Vendor.name");
	        System.out.println("vendorName is: " +  vendorName);
	          assertThat(vendorName,("John Smith"));*/


	}
	
	
	
}
