package RestAssured2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.Header;
import io.restassured.http.Headers;


import io.restassured.RestAssured;
import  io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Users 
{
	
	//https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/
	//https://jsonplaceholder.typicode.com/users
	
	@Test
	public void WeatherMessageBody() throws ParseException
	{
	// RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
	
    RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("https://jsonplaceholder.typicode.com/users");
	ResponseBody body = response.getBody();
	//System.out.println("Response Body is: " + body.asString());
	
    JSONParser parser = new JSONParser();
    
	String str=body.asString();
	
    Object obj = parser.parse(str);
    JSONObject jsonObject = (JSONObject) obj;
    
	JSONArray companyList = (JSONArray) jsonObject.get("id");
	 Iterator<String> iterator = companyList.iterator();
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
	

	 
	}
	
}
