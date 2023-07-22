package RestAssured3;

import java.io.File;
import java.io.FileInputStream;
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
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.io.IOUtils;

public class SoapRequest 
{
	

	//https://sqa.stackexchange.com/questions/28360/using-rest-assured-library-for-testing-soap-webservices
	
	

	public void RegistrationSuccessful1()
	{		
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		RequestSpecification request = RestAssured.given();
		Response response = null;

	String requestBody = "{\n" +
				"  \"name\": \"PUT_tammy33\",\n" +
				"  \"salary\": \"90000\",\n" +
				"  \"age\": \"90\"\n" +
				"}";
		
	//32246
		
		request.body(requestBody);
		request.contentType(ContentType.JSON);
		response = request.put("/update/32246");
		

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);
		System.out.println("Response body: " + response.body().asString());
 
	}
	
	@Test
	public void postMethod() throws Exception {


	        FileInputStream fileInputStream = new FileInputStream(new File("SoapRequestFile.xml"));
	         RestAssured.baseURI="http://currencyconverter.kowabunga.net";

	         Response response=RestAssured.given()
	                .header("Content-Type", "text/xml")
	                .and()
	                .body(IOUtils.toString(fileInputStream,"UTF-8"))
	         .when()
	            .post("/converter.asmx")
	         .then()
	                .statusCode(200)
	                .and()
	                .log().all()
	                .extract().response();

	        XmlPath jsXpath= new XmlPath(response.asString());//Converting string into xml path to assert
	        String rate=jsXpath.getString("GetConversionRateResult");
	        System.out.println("rate returned is: " +  rate);


	}
	
	
	
}
