package RestAssured3;

//import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


import io.restassured.path.xml.config.XmlPathConfig;
import io.restassured.path.xml.element.Node;
import io.restassured.path.xml.element.NodeChildren;


public class SoapRequest5 
{
	
	
	//http://parabank.parasoft.com/parabank/services/bank/customers/12212/
	//https://www.ontestautomation.com/testing-rest-services-with-rest-assured/
	
	@Test
	public void listCountries()
	{
          
		//RequestSpecification request = RestAssured.given();
		// String firstName = request.get("/greetXML").xmlPath().getString("greeting.firstName"); 
		
		RestAssured.baseURI = "http://parabank.parasoft.com/";
		Response response = null;
		RequestSpecification request = RestAssured.given();
		
		request.get("parabank/services/bank/customers/12212/").  
	        then().
	            assertThat().body("customer.id", equalTo("12212")).
	        and().
	            assertThat().body("customer.firstName", equalTo("John")).
	        and().
	            assertThat().body("customer.lastName", equalTo("Smith")); 
		
		
		
		
     }
	 
	 
	 
}
