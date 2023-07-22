package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List1 {

	public static void main(String[] args) {

		
		List<String> l1=new ArrayList<String>();
		l1.add("100");
		l1.add("Ravi");
		l1.add("10000");
		l1.add("Hyderabad");
		l1.add("Test Engineer");

		List<String> l2=new ArrayList<String>();
		l2.add("101");
		l2.add("Kiran");
		l2.add("20000");
		l2.add("Hyderabad");
		l2.add("Test Manager");
		
		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("Empid", "100");
		m1.put("Ename", "Ravi");
		m1.put("Salary", "10000");
		m1.put("City", "Hyderabad");
		m1.put("Role", "Test Engineer");

		
		Map<String,String> m2=new HashMap<String,String>();
		m2.put("Empid", "101");
		m2.put("Ename", "Kiran");
		m2.put("Salary", "20000");
		m2.put("City", "Hyderabad");
		m2.put("Role", "Test Manager");
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println(l1);
		System.out.println(l2);

	}

}
