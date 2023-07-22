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


public class City2 
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

	// System.out.println("Response Body is: " + body.asString());
	 
	 String str =  body.asString();
	 
	 System.out.println("Response Body is: " + str);
	 
	 JsonPath jsonPath = response.jsonPath();
	 System.out.println("City received from Response " + jsonPath.get("City"));
	 
	 String xmlns1 = jsonPath.get("City");
	 String series1 = jsonPath.get("Temperature");
	 String url1 = jsonPath.get("Humidity");
	 String limit1 = jsonPath.get("WeatherDescription");
	 String offset1 = jsonPath.get("WindSpeed");
	 String total1 = jsonPath.get("WindDirectionDegree");
	 		
	 System.out.println("**************************************");
		System.out.println("MRData.xmlns Data  is  :"+xmlns1);
		System.out.println("MRData.series Data  is :"+series1);
		System.out.println("MRData.url  Data  is   : "+url1);
		System.out.println("MRData.limit Data  is  : "+limit1);
		System.out.println("MRData.offset Data  is :"+offset1);
		System.out.println("MRData.total  Data  is : "+total1);
 	System.out.println("**************************************");
 	
	}
	
}
