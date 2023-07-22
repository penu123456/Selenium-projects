package RestAssured1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample2 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader("circute.json"))
		{
			//Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
            
          //  Iterate over employee array
           employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

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
		

		//Get employee website name
		String limit = (String) MRData.get("limit");	
		System.out.println(limit);
		
		
		//Get employee website name
		String offset = (String) MRData.get("offset");	
		System.out.println(offset);
		
		
		//Get employee website name
		String total = (String) MRData.get("total");	
		System.out.println(total);
		
		
	}
}
