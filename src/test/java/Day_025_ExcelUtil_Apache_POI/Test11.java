package Day_025_ExcelUtil_Apache_POI;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class Test11 {
	

	
	Map<String, HashMap<String, String>> Datatable = new HashMap<String, HashMap<String, String>>();
	
	@Test
	public void Test1() throws Exception
	{
		
	
		
		HashMap<String, String> mp=new HashMap<String,String>();
		mp.put("UserName", "Admin");
		mp.put("Password", "admin123");
		mp.put("Nationality", "Indian123");
		Datatable.put("TC01", mp);
		
		HashMap<String, String> mp1=new HashMap<String,String>();
		mp1.put("UserName", "Admin");
		mp1.put("Password", "admin123");
		mp1.put("Nationality", "Indian124");
		Datatable.put("TC02", mp1);

		
		String username_tc01=Datatable.get("TC01").get("UserName");
		
		System.out.println(username_tc01);
		System.out.println(Datatable.get("TC01").get("Password"));
		System.out.println(Datatable.get("TC01").get("Nationality"));
		System.out.println("----------------------------------------------");
		
		System.out.println(Datatable.get("TC02").get("UserName"));
		System.out.println(Datatable.get("TC02").get("Password"));
		System.out.println(Datatable.get("TC02").get("Nationality"));
		System.out.println("----------------------------------------------");
		

		


	
	}

	

}
