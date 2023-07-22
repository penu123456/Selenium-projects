package RestAssured1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample3 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader("employees2.json"))
		{
			//Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject MRdata = (JSONObject) obj;
        	
            JSONObject employeeData = (JSONObject) MRdata.get("employee");
            System.out.println(employeeData);
                      

            String firstName = (String) employeeData.get("firstName");
            System.out.println(firstName);
            
            String lastName = (String) employeeData.get("lastName");
            System.out.println(lastName);
            
            String website = (String) employeeData.get("website");
            System.out.println(website);

           // JSONArray employeeList = (JSONArray) obj;
           // System.out.println(employeeList);
            
          //  Iterate over employee array
        //   employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}

	private static void parseEmployeeObject(JSONObject employee) 
	{
		//Get employee object within list
		JSONObject MRData = (JSONObject) employee.get("MRData");
		
		//Get employee first name
		String firstName = (String) MRData.get("xmlns");	
		System.out.println(firstName);
		
		//Get employee last name
		String lastName = (String) MRData.get("series");	
		System.out.println(lastName);
		
		//Get employee website name
		String website = (String) MRData.get("url");	
		System.out.println(website);
		

		
	}
}
