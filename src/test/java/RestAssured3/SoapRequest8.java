package RestAssured3;

//import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
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
public class SoapRequest8 
{
	
	
	//http://parabank.parasoft.com/parabank/services/bank/customers/12212/
	//https://www.ontestautomation.com/testing-rest-services-with-rest-assured/
	//http://learn-automation.com/configure-rest-assured-with-eclipse/
	
	@Test
	public void listCountries()
	{
          
		//RequestSpecification request = RestAssured.given();
		// String firstName = request.get("/greetXML").xmlPath().getString("greeting.firstName"); 
		
		RestAssured.baseURI = "http://localhost:8080/BILVANI/HelloWorld.html";
		Response response = null;
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.TEXT);
		
		//response=request.get("parabank/services/bank/customers/12212/");
		 response = request.get(RestAssured.baseURI );
		
		
		//response= request.post("/book/{hotelName}/{roomNumber}", "Hotels R Us", 22);
		
		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);
		System.out.println("Response body: " + response.body().asString());
		
		//String json   =response.body().asString();
		//System.out.println("customer id: " + json);
		
		/*XmlPath xmlpath = new XmlPath(json);

	   
		String customerid = xmlpath.getString("customer.id");	
		System.out.println("customer id: " + customerid);
		System.out.println("customer id: " + xmlpath.getString("customer.firstName"));
		System.out.println("customer id: " + xmlpath.getString("customer.lastName"));
		
		System.out.println("customer address: " + xmlpath.getString("customer.address.street"));
		System.out.println("customer Phone#: " + xmlpath.getString("customer.phoneNumber"));
		System.out.println("customer ssn#: " + xmlpath.getString("customer.ssn"));
		
		
		
		
		
		
		*/
		
		
     }
	 
	 
	 
}
