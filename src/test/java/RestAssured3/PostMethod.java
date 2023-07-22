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


public class PostMethod 
{
	
	//https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/
	//https://jsonplaceholder.typicode.com/users
	//https://stackoverflow.com/questions/28982412/how-to-search-find-in-json-with-java/29084522
	
	@Test
	public void RegistrationSuccessful1()
	{		
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "sudhakar");
		requestParams.put("salary", "50000");
		requestParams.put("age", "35");

		request.body(requestParams.toJSONString());
		Response response = request.get("/create");

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());
	}
	
	

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
