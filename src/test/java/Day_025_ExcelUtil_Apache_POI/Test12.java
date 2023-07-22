package Day_025_ExcelUtil_Apache_POI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class Test12 {
	
	
	//Map<String, String> ColumnsData = new HashMap<String, String>();

	//Map<String, String> ColumnsData = new HashMap<String, String>();
	
	Map<String, ArrayList<String>> Datatable = new HashMap<String, ArrayList<String>>();
	
	@Test
	public void Test1() throws Exception
	{
		
	
		
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Admin2");
		l1.add("admin222");
		l1.add("Indian333");
		Datatable.put("TC01", l1);
		
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("Admin1");
		l2.add("admin11");
		l2.add("Indian111");
		Datatable.put("TC02", l2);
	
		
		System.out.println(Datatable.get("TC01"));
		
		System.out.println(Datatable.get("TC02"));
		

		


	
	}

	

}
