package RestAssured3;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
 
public class PostRequest {
	
	//https://techndeck.com/get-request-using-rest-assured/
 
	@Test
	public void createEmployee() {
 
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
 
		String requestBody = "{\n" +
				"  \"name\": \"tammy2\",\n" +
				"  \"salary\": \"50000\",\n" +
				"  \"age\": \"50\"\n" +
				"}";
 
 
		Response response = null;
 
		try {
			response = RestAssured.given()
					.contentType(ContentType.JSON)
					.body(requestBody)
					.post("/create");
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		System.out.println("Response :" + response.asString());
		System.out.println("Status Code :" + response.getStatusCode());
		System.out.println("Does Reponse contains 'tammy'? :" + response.asString().contains("tammy"));
 
 
		assertEquals(200, response.getStatusCode());
	}
}