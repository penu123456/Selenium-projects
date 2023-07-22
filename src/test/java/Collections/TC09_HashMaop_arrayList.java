package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TC09_HashMaop_arrayList {
	
	
	public static void main(String[] args) {
		
		/*Map<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		List.add(18);
		List.add(10);
	    map.put("mango",List);
	    
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		
		List1.add(30);
		List1.add(40);

		map.put("Orange",List1);
		*/
		
		Map<String, HashMap<String, String>> E1 = new HashMap<String,HashMap<String,String>>();
		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("Ename", "Ravi");
		m1.put("Salary", "10000");
		m1.put("City", "Hyderabad");
		m1.put("Role", "Test Engineer");
		
		E1.put("100", (HashMap<String, String>) m1);
		System.out.print(E1.get(m1));
		
		
		Map<String, HashMap<String, String>> E2 = new HashMap<String,HashMap<String,String>>();
		Map<String,String> m2=new HashMap<String,String>();
		m2.put("Ename", "Kiran");
		m2.put("Salary", "20000");
		m2.put("City", "Hyderabad");
		m2.put("Role", "Test Manager");
		E2.put("101", (HashMap<String, String>) m2);
		System.out.print(E1.get(m2));

		
	}

}
