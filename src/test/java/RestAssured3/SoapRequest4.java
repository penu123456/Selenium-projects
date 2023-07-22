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

import io.restassured.*;
import io.restassured.path.xml.config.XmlPathConfig;
import io.restassured.path.xml.element.Node;
import io.restassured.path.xml.element.NodeChildren;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static io.restassured.path.xml.XmlPath.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class SoapRequest4 
{
	
	
	//https://github.com/rest-assured/rest-assured/blob/master/xml-path/src/test/java/io/restassured/path/xml/XmlPathTest.java
	
	@Test
	public void listCountries()
	{
               
                // Using Rest-Assured class to setup a request
                RestAssured.baseURI = "https://example.com/api/countries";
		// Getting the RequestSpecification of the request
		RequestSpecification httpRequest = RestAssured.given();
		

                // Making GET request directly by RequestSpecification.get() method
		Response response = httpRequest.get(“/India");
		

                //Retrieving Body of response
		String body = response.getBody().asString();
		//Retrieving Status Code of response
		int status = response.getStatusCode();
		//Retrieving Status Line
		String statusLine = response.getStatusLine();
		

		//Printing the response
		System.out.println("Response Body is "+body);
		System.out.println("Status code is "+status);
		System.out.println("Status line is "+statusLine);
         }
	 
	 
	 
}
