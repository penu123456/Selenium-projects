package Collections;

import java.util.HashMap;
import java.util.Map;

public class Vacancy {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Map<String,String> mp=new HashMap<String,String>();
		
		mp.put("FirstName", "Ravi");
		mp.put("LastName", "Th");
		mp.put("MiddleName", "ab");
		mp.put("City", null);
		mp.put("City", "Hyderabad");
		mp.put("City", "Mumbai");
		mp.put("City", null);
		mp.put(null, "Miyapur");
		mp.put(null, "Miyapur1");
		mp.put("Area", "Miyapur");
		mp.put("10", "100");
		mp.put("10", "1000");
		System.out.println(mp);
		/*System.out.println(mp.get("FirstName"));
		System.out.println(mp.get("LastName"));
		System.out.println(mp.get("MiddleName"));
		System.out.println(mp.get("City"));
		*/
		
		
		Map<String,String> mp1=new HashMap<String,String>();
		mp1.put("FirstName", "Kiran");
		mp1.put("LastName", "Th1");
		mp1.put("MiddleName", "dd");
		
		System.out.println(mp1);

	}

}
