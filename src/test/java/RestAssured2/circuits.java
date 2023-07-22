package RestAssured2;



import java.util.List;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


import io.restassured.response.Response;


public class circuits 
{
	
	//https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/
	//https://jsonplaceholder.typicode.com/users
	//https://stackoverflow.com/questions/28982412/how-to-search-find-in-json-with-java/29084522
	
	@Test
	public void WeatherMessageBody() 
	{
		
		Response resp=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		System.out.println("JSON is "+resp.asString());
		
		// ALT+CTRL+SHIFT+M

		 String json   =resp.asString();
		 JsonPath jsonPath = new JsonPath(json);

		 //String MRData1 = jsonPath.getString("MRData");	
		 //System.out.println("MR Data  is "+MRData1);
		
		 String xmlns1 = jsonPath.get("MRData.xmlns");
		 String series1 = jsonPath.get("MRData.series");
		 String url1 = jsonPath.get("MRData.url");
		 String limit1 = jsonPath.get("MRData.limit");
		 String offset1 = jsonPath.get("MRData.offset");
		 String total1 = jsonPath.get("MRData.total");
		 		
		 
		 
     	System.out.println("**************************************");
		System.out.println("MRData.xmlns Data  is  :"+xmlns1);
		System.out.println("MRData.series Data  is :"+series1);
		System.out.println("MRData.url  Data  is   : "+url1);
		System.out.println("MRData.limit Data  is  : "+limit1);
		System.out.println("MRData.offset Data  is :"+offset1);
		System.out.println("MRData.total  Data  is : "+total1);
    	System.out.println("**************************************");
    	
    	
    	
		
		String CircuitTable_Season = jsonPath.get("MRData.CircuitTable.season");
		System.out.println("MRData.CircuitTable_Season  Data  is : "+CircuitTable_Season);
		
		 List<String> Circuits = JsonPath.from(json).get("MRData.CircuitTable.Circuits");
		 System.out.println("number of Circuits size :"+ Circuits.size());
		 
		 

		 
		 //MRData.CircuitTable.Circuits.circuitId details starts 
		 
		/* System.out.println("circuitId is :"+JsonPath.
		from(json).get("MRData.CircuitTable.Circuits.circuitId[0]"));
		 		 
		 System.out.println("circuit url is :"+JsonPath.
		from(json).get("MRData.CircuitTable.Circuits.url[0]"));
		 
		 
		 System.out.println("circuit Name is :"+JsonPath.
		from(json).get("MRData.CircuitTable.Circuits.circuitName[0]"));
		 
		 
		 System.out.println("lat is :"+JsonPath.
		from(json).get("MRData.CircuitTable.Circuits.Location[0].lat"));
		 
		 
		 System.out.println("long is :"+JsonPath.
		from(json).get("MRData.CircuitTable.Circuits.Location[0].long"));
					 
		System.out.println("locality is :"+JsonPath.
		from(json).get("MRData.CircuitTable.Circuits.Location[0].locality"));
		
		System.out.println("country is :"+JsonPath.
		from(json).get("MRData.CircuitTable.Circuits.Location[0].country")); */
		
		 //MRData.CircuitTable.Circuits.circuitId details ends 
		
		
		
     //   for (int i=0;i<Circuits.size();i++)
		
		 
		 /*for (int i=0;i<=2;i++)
        {
        	
        	
        	System.out.println("**************************************");
        	
        				System.out.println("circuitId is :"+JsonPath.
        				from(json).get("MRData.CircuitTable.Circuits.circuitId ["+ i +"]  "));
        				 		 
        				 System.out.println("circuit url is :"+JsonPath.
        				from(json).get("MRData.CircuitTable.Circuits.url  ["+ i +"] "));
        				 
        				 
        				 System.out.println("circuit Name is :"+JsonPath.
        				from(json).get("MRData.CircuitTable.Circuits.circuitName ["+ i +"] "));
        				 
        				 
        				 System.out.println("lat is :"+JsonPath.
        				from(json).get("MRData.CircuitTable.Circuits.Location["+ i +"].lat"));
        				 
        				 
        				 System.out.println("long is :"+JsonPath.
        				from(json).get("MRData.CircuitTable.Circuits.Location["+ i +"].long"));
        							 
        				System.out.println("locality is :"+JsonPath.
        				from(json).get("MRData.CircuitTable.Circuits.Location["+ i +"].locality"));
        				
        				System.out.println("country is :"+JsonPath.
        				from(json).get("MRData.CircuitTable.Circuits.Location["+ i +"].country"));
        				
        				
        				
        	        	System.out.println("**************************************");
        	        	
        	 
        	
        }*/
        
        
        
        
	}
	
}
