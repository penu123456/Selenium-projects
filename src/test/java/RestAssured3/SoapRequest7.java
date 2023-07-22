package RestAssured3;

//import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest3;
import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


import io.restassured.path.xml.config.XmlPathConfig;
import io.restassured.path.xml.element.Node;
import io.restassured.path.xml.element.NodeChildren;

import io.restassured.response.Response;
public class SoapRequest7 
{
	
	
	//http://parabank.parasoft.com/parabank/services/bank/customers/12212/
	//https://www.ontestautomation.com/testing-rest-services-with-rest-assured/
	
		
	@Test
	public void RegistrationSuccessful1()
	{		
		//RestAssured.baseURI ="http://www.holidaywebservice.com/HolidayService_v2/HolidayService2.asmx?op=GetCountriesAvailable";
		
		RestAssured.baseURI ="http://www.holidaywebservice.com/";
		RequestSpecification request = RestAssured.given();
		Response response = null;
		
		String xml="HolidayService_v2/HolidayService2.asmx?op=GetCountriesAvailable";

		/*String requestBody = "{\n" +
				"  \"name\": \"tammy33\",\n" +
				"  \"salary\": \"70000\",\n" +
				"  \"age\": \"70\"\n" +
				"}";*/
		
		
		
		/* String countryCode="Canada";
		 String  xml= "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
		 "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\"> " +
		 " <soap12:Body> " +
		 " <GetHolidaysAvailable xmlns=\"http://www.holidaywebservice.com/HolidayService_v2/\"> " +
		 " <countryCode>"+countryCode+"</countryCode>" +
		 " </GetHolidaysAvailable>" +
		 " </soap12:Body>" +
		 "</soap12:Envelope>";*/
		 
		 request.body(xml);
		
	
		request.contentType(ContentType.XML);
		response = request.post("/create");
		

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);
		System.out.println("Response body: " + response.body().asString());
 
	}
	
	

	 
	 
	 
}
