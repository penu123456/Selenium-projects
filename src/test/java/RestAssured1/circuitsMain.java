package  RestAssured1;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import  io.restassured.response.Response;
import org.json.simple.JSONObject;


/*
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;



import  io.restassured.RestAssured;
import  io.restassured.response.Response;

import  org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

*/




import CommonUtil.*;
import HTMLReport.TestHTMLReporter6;
import ExcelUtil.ExcelApiTest3;
import Login.Login;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;



import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;




 
public class circuitsMain
{
	
	
	@Test
	public void FirstExample()throws Exception {
		
		
		WebDriver driver;
		Response resp=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		
		
		String yourJson1 = resp.asString();
		System.out.println(yourJson1);
		String str1="SudhakarT";
		System.out.println("Response data  is :"+str1);

		String yourJson = "{\"key1\":\"val1\", \"key2\":\"val2\"}";
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(yourJson);
		JsonObject obj = element.getAsJsonObject(); //since you know it's a JsonObject
		Set<Map.Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
		for (Map.Entry<String, JsonElement> entry: entries) {
		    System.out.println(entry.getKey());
		    System.out.println(entry.getValue());
		    System.out.println("--------");
		}
		
		
		
		
		 
	
		
	}
		
}
		
		
	
		/*JSONObject obj = new JSONObject(json);
		List<String> keys = obj.getJsonObject("list").getKeys();
		foreach (String key : keys) {
		realm.createObjectFromRealm(InnerObject.class, obj.getJsonObject("list").getJsonObject(key);
		}*/
		
		
		
		
		/*
		
		 JSONParser parser = new JSONParser();
		 Object obj = parser.parse(jsonstring);
         JSONArray array = (JSONArray)obj;
         JSONObject jsonObject = (JSONObject)array.get(1);
		
		
		//JSONObject jsonObject = new JSONObject();
		Set keys = jsonObject.keySet();
	    Iterator a = keys.iterator();
	    while(a.hasNext()) {
	    	String key = (String)a.next();
	        // loop to get the dynamic key
	        String value = (String)jsonObject.get(key);
	        System.out.print("key : "+key);
	        System.out.println(" value :"+value);
	    }
	    */
	    
	    



		
		//List winnerIds = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json").jsonPath().getList("lotto.winnders.winnerId");
		
		
		/*
		 Gson gson = new Gson();
		
        //Read the employee.json file
        BufferedReader br = new BufferedReader(  
                new FileReader("C:\\Users\\Sudhakar\\Desktop\\circuitId.json"));
        
        
        //convert the json to  Java object (Employee)
        MRData MRData1 = gson.fromJson(br, MRData.class);
		 
		 		 
         System.out.println("Employee Name    : "+MRData1.getXmlns());
       
*/
		
		
	
	
	

	
	
	



