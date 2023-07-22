package RestAssured3;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

 @Test
 public void retrieveSpecificEmployee() {

  RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

  Response response = null;

  try {
   response = RestAssured.given()
    .when()
    .get("/employees");
  } catch (Exception e) {
   e.printStackTrace();
  }

  System.out.println("Response :" + response.asString());
  System.out.println("Status Code :" + response.getStatusCode());
  System.out.println("Does Reponse contains 'employee_salary'? :" + response.asString().contains("employee_salary"));


  assertEquals(200, response.getStatusCode());
 }
}