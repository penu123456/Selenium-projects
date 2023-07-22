package RestAssured3;

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


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class QueryParameters 
{
	

	//https://techndeck.com/get-request-using-rest-assured/
	//http://dummy.restapiexample.com/api/v1/employees
	
	//https://reqres.in/api/users?page=2&id=5
	
	@Test
	public void filterUser() {
 
	
 
		try {
			
			RestAssured.baseURI = "https://reqres.in/api";
			Response response = null;
			RequestSpecification request = RestAssured.given();
		
			
			request.queryParam("page", "2");
			request.queryParam("id", 5);
			response =request.get("/users");
			
			System.out.println("Response :" + response.asString());
			System.out.println("Status Code :" + response.getStatusCode());
			
		} catch (Exception e) {e.printStackTrace();}
 

 
	}

	
	
	
	
	
}
