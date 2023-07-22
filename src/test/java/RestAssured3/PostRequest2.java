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


public class PostRequest2 
{
	

	//https://techndeck.com/get-request-using-rest-assured/
	//http://dummy.restapiexample.com/api/v1/employees
	
	@Test(dataProvider="TC01_PostRequest_Data")
	public void RegistrationSuccessful1(String JSON)
	{		
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		RequestSpecification request = RestAssured.given();
		Response response = null;

		/*String requestBody = "{\n" +
				"  \"name\": \"tammy33\",\n" +
				"  \"salary\": \"70000\",\n" +
				"  \"age\": \"70\"\n" +
				"}";*/
		
		request.body(JSON);
		
		//request.body(requestBody);
		request.contentType(ContentType.JSON);
		response = request.post("/create");
		

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);
		System.out.println("Response body: " + response.body().asString());
 
	}
	
	
	
	@DataProvider (name = "TC01_PostRequest_Data")
    public static  Object[][] Authentication1() throws Exception{
		
		ExcelApiTest3 eat= new ExcelApiTest3();
        Object[][] testObjArray = eat.getTableArray("C://HTML Report//RestAPI//TC01_PostData.xls","Sheet1");
        // System.out.println(testObjArray.length);
          return (testObjArray); 
	}

	
	
}
