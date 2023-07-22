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

public class SoapRequest3 
{
	
	
	//https://github.com/rest-assured/rest-assured/blob/master/xml-path/src/test/java/io/restassured/path/xml/XmlPathTest.java
	
	
	private static final String XML = "<shopping>\n" +
            "      <category type=\"groceries\">\n" +
            "        <item>\n" +
            "\t   <name>Chocolate</name>\n" +
            "           <price>10</" +
            "price>\n" +
            "" +
            "   " +
            "\t</item>\n" +
            "        <item>\n" +
            "\t   <name>Coffee</name>\n" +
            "           <price>20</price>\n" +
            "\t</item>\n" +
            "      </category>\n" +
            "      <category type=\"supplies\">\n" +
            "        <item>\n" +
            "\t   <name>Paper</name>\n" +
            "           <price>5</price>\n" +
            "\t</item>\n" +
            "        <item quantity=\"4\">\n" +
            "           <name>Pens</name>\n" +
            "           <price>15.5</price>\n" +
            "\t</item>\n" +
            "      </category>\n" +
            "      <category type=\"present\">\n" +
            "        <item when=\"Aug 10\">\n" +
            "           <name>Kathryn's Birthday</name>\n" +
            "           <price>200</price>\n" +
            "        </item>\n" +
            "      </category>\n" +
            "</shopping>";

	
	
	

	 @Test
	    public void initializeUsingCtorAndGetList() throws Exception {
	        final NodeChildren categories = new XmlPath(XML).get("shopping.category");
	        
	        System.out.println("categories.size "+categories.size());
	        assertThat(categories.size(), equalTo(3));
	    }
	 
	 
	  @Test
	    public void getNodeChildrenAsListWithTypeNodeReturnsAListOfNodes() throws Exception {
	        final List<Node> categories = new XmlPath(XML).getList("shopping.category", Node.class);
	        assertThat(categories.size(), equalTo(3));
	    }
	  
	  
	  @Test
	    public void initializeUsingGivenAndGetAttributes() throws Exception {
	        final List<String> categories = given(XML).get("shopping.category.@type");
	        assertThat(categories, hasItems("groceries", "supplies", "present"));
	    }

	  
	  
	  
	  
	  @Test
	    public void initializeUsingWithAndGetChildren() throws Exception {
	        final List<String> categories = with(XML).get("shopping.category.item.name.list()");
	        assertThat(categories, hasItems("Chocolate", "Coffee", "Paper", "Pens", "Kathryn's Birthday"));
	    }

	 
	 
	 
	 
}
