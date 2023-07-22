package RestAssured3;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RegistrationSuccessful 
{
	
	//https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/
	//https://jsonplaceholder.typicode.com/users
	//https://stackoverflow.com/questions/28982412/how-to-search-find-in-json-with-java/29084522
	

	public void RegistrationSuccessful1()
	{		
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender3"); // Cast
		requestParams.put("LastName", "Singh3");
		requestParams.put("UserName", "sdimpleuser2dd20113");
		requestParams.put("Password", "password13");	
		requestParams.put("Email",  "sample2ee26d93@gmail.com");

		request.body(requestParams.toJSONString());
		Response response = request.get("/register");

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());
	}
	
	
	@Test
	 public void submitForm() {
	        RestAssured.baseURI = "https://www.example.com";
			RequestSpecification request = RestAssured.given();
	        
			JSONObject requestParams = new JSONObject();
	   
			requestParams.put("username", "user77@site.com");
			requestParams.put("password", "Pas5432177");
			
			
			request.body(requestParams.toJSONString());
			Response response = request.get("/login");
			
			int statusCode = response.getStatusCode();
			System.out.println("The status code recieved: " + statusCode);

			System.out.println("Response body: " + response.body().asString());
	 
	    }
	
	
	
	
}
