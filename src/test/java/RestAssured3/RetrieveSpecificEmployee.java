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


public class RetrieveSpecificEmployee 
{
	

	//https://techndeck.com/get-request-using-rest-assured/
	//http://dummy.restapiexample.com/api/v1/employees
	
		//https://reqres.in/api/users?page=2&id=5
	
	@Test
	public void retrieveSpecificEmployee() {

		  String id = "23490";
		  RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/" + id;

		  Response response = null;
		  
		  try {
			RequestSpecification request = RestAssured.given();

			response =request.get();
			
			 System.out.println("Response :" + response.asString());
			 System.out.println("Status Code :" + response.getStatusCode());
			 System.out.println("Does Reponse contains 'employee_salary'? :" + response.asString().contains("employee_salary"));


			
		} catch (Exception e) {e.printStackTrace();}
 

 
	}

	
	
	
	
	
}
