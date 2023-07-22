package RestAssured1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JSON_Writer_GSON
{
    public static void main(String[] args)
    {
        try
        {
            //Create a new Employee object
            Employee employee = new Employee();
            //Set values to its properties
            employee.setEmployeeName("JavaInterviewPoint");
            employee.setEmployeeId(100);

            List departmentList = new ArrayList();
            departmentList.add("Chemical1");
            departmentList.add("Mechanical1");
            departmentList.add("Automobile1");
            departmentList.add("Computer1");

            employee.setDepartment(departmentList);

            // Create a new Gson object
            Gson gson = new Gson();

            //convert the Java object to json
            String jsonString = gson.toJson(employee);
            //Write JSON String to file        
            FileWriter fileWriter = new FileWriter("D:\\employee.json");
            fileWriter.write(jsonString);
            fileWriter.close();
            
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}