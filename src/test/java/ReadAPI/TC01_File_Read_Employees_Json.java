package  ReadAPI;

import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;


 
public class TC01_File_Read_Employees_Json
{
	
	
	@Test
	public void FirstExample()throws Exception {
		
		 File f = new File("employees.json");
	        if (f.exists()){
	            InputStream is = new FileInputStream("employees.json");
	            String jsonTxt = IOUtils.toString(is, "UTF-8");
	            
	            JsonPath jsonPath = new JsonPath(jsonTxt);
	            System.out.println(jsonTxt);
	            
	       	 String EMP0_firstName = jsonPath.get("employee[0].firstName");
	       	 String EMP0_lastName = jsonPath.get("employee[0].lastName");
	       	 String EMP0_website = jsonPath.get("employee[0].website");
	       
	       	System.out.println("employee 0 -firstName  is  : "+EMP0_firstName);
	       	System.out.println("employee 0 -lastName  is   : "+EMP0_lastName);
	       	System.out.println("employee 0 -website  is    : "+EMP0_website);
	       	
	       	System.out.println("_____________________________");
	       	
	    	 String EMP1_firstName = jsonPath.get("employee[1].firstName");
	       	 String EMP1_lastName = jsonPath.get("employee[1].lastName");
	       	 String EMP1_website = jsonPath.get("employee[1].website");
	       
	       	System.out.println("employee 1 -firstName  is  : "+EMP1_firstName);
	       	System.out.println("employee 1 -lastName  is   : "+EMP1_lastName);
	       	System.out.println("employee 1 -website  is    : "+EMP1_website);
	       	
	       	System.out.println("_____________________________");
	       	   
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
		
		
	
	
	

	
	
	



