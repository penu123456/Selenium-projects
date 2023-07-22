package RestAssured2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.Header;
import io.restassured.http.Headers;


public class City 
{
	
	//https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/
	//https://jsonplaceholder.typicode.com/users
	
	@Test
	public void WeatherMessageBody()
	{
	 RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response = httpRequest.get("/Hyderabad");

	 ResponseBody body = response.getBody();

	 System.out.println("Response Body is: " + body.asString());
	 
	 JsonPath jsonPathEvaluator = response.jsonPath();
	 
	 
	// Get all the headers. Return value is of type Headers.
	 // Headers class implements Iterable interface, hence we
	 // can apply an advance for loop to go through all Headers
	 // as shown in the code below
	 Headers allHeaders = response.headers();
	 
	 // Iterate over all the Headers
	 
	 System.out.println("__________________________________________________");
	 for(Header header : allHeaders)
	 {
	 System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
	 }
	 System.out.println("__________________________________________________");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
System.out.println("************************************************");
	 
	// Reader header of a give name. In this line we will get
	 // Header named Content-Type
	 String contentType = response.header("Content-Type");
	 System.out.println("Content-Type value: " + contentType);
	 
	 // Reader header of a give name. In this line we will get
	 // Header named Server
	 String serverType =  response.header("Server");
	 System.out.println("Server value: " + serverType);
	 
	 // Reader header of a give name. In this line we will get
	 // Header named Content-Encoding
	 String acceptLanguage = response.header("Content-Encoding");
	 System.out.println("Content-Encoding: " + acceptLanguage);
	 
System.out.println("************************************************"); 
	 
	 
	 
	 
	// Let us print the city variable to see what we got
	 System.out.println("City received from Response " + jsonPathEvaluator.get("City"));
	 
	 // Print the temperature node
	 System.out.println("Temperature received from Response " + jsonPathEvaluator.get("Temperature"));
	 
	 // Print the humidity node
	 System.out.println("Humidity received from Response " + jsonPathEvaluator.get("Humidity"));
	 
	 // Print weather description
	 System.out.println("Weather description received from Response " + jsonPathEvaluator.get("Weather"));
	 
	 // Print Wind Speed
	 System.out.println("City received from Response " + jsonPathEvaluator.get("WindSpeed"));
	 
	 // Print Wind Direction Degree
	 System.out.println("City received from Response " + jsonPathEvaluator.get("WindDirectionDegree"));
	 
	 
	}
}
