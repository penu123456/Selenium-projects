package RestAssured3;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
 
public class PostRequestEmployee {
	
	//https://techndeck.com/get-request-using-rest-assured/
 
	@Test
	public void createEmployee() {
		
		
		
 
		RestAssured.baseURI = "http://localhost:8080/JAXRSJsonCRUDExample/rest";
 
		String requestBody = "<employee>\r\n" + 
				"  <empNo>E06</empNo>\r\n" + 
				"  <empName>SudhakarTh</empName>\r\n" + 
				"  <position>Salesman</position>\r\n" + 
				"</employee>";
 
 
		Response response = null;
 
		try {
			response = RestAssured.given()
					.contentType(ContentType.XML)
					.body(requestBody)
					.post("/employees");
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		System.out.println("Response :" + response.asString());
		System.out.println("Status Code :" + response.getStatusCode());
		System.out.println("Does Reponse contains 'tammy'? :" + response.asString().contains("tammy"));
 
 
		assertEquals(200, response.getStatusCode());
	}
}