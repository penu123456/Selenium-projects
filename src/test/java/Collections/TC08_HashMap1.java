package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class TC08_HashMap1 {

	public static void main(String[] args) {
		
		Map<String,Integer> s1=new TreeMap<String,Integer>();
		
		s1.put("Kiran",10);
		s1.put("Ravi",20);
		s1.put("Venkat",30);
		s1.put("Venkat",20);
		s1.put("Kiran",500);
		//s1.put("Kiran",500);
		/*s1.put("Ravi",80);
		s1.put(null,800);
		s1.put(null,900);  
		s1.put("ABC",null);
		s1.put("ABC",2000);
		s1.put("ABC",null);*/
		//s1.put("Kiran",5);

		System.out.println(s1); // 
		
		
		
		//1st approach
		Iterator<Map.Entry<String, Integer>> itr = s1.entrySet().iterator();
		
		while (itr.hasNext()) {
		    Map.Entry<String, Integer> mp = itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			System.out.println("__________________________");
		}
		
		
		
		
		//2nd approach for each value
		for (Map.Entry<String, Integer> mp : s1.entrySet()) {    
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			System.out.println("**************************");
		}
		
		
		
		
		
		
		
		Map<Integer,String> s2=new TreeMap<Integer,String>();
		s2.put(80,"Kiran");
		s2.put(20,"Ravi");
		s2.put(30,"Venkat1");
		s2.put(40,"Venkat2");
		s2.put(40,"Meghana");
		System.out.println(s2);
	}

}
