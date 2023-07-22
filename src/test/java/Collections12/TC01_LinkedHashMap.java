package Collections12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TC01_LinkedHashMap {

	public static void main(String[] args) {

		// Map is used to store Object information in key-Value pairs combination
		//while retieving elements from Tree , it follows sorting order
		
		Map<String,Integer> mp=new TreeMap<String,Integer>();
		mp.put("Sudhakar", 70);
		mp.put("Ravi", 64);
		mp.put("DEF", 200);
		mp.put("Kiran", 55);
		mp.put("Ravi", 84);
		mp.put("ABC", 100);
		System.out.println(mp);
		
		for (Map.Entry<String, Integer> K1 : mp.entrySet()) { 
			
			System.out.println(K1.getKey());
			System.out.println(K1.getValue());
			System.out.println("**************************");
		}
		
		
		
		
		
		Map<Integer,Integer> mp1=new TreeMap<Integer,Integer>();
		mp1.put(1111,10);
		mp1.put(2222,20);
		mp1.put(3333,20);
		//System.out.println(mp1);
		
		/*for (Map.Entry<Integer, Integer> k2 : mp1.entrySet()) { 
			
			System.out.println(k2.getKey());
			System.out.println(k2.getValue());
			System.out.println("**************************");
		}*/
		
		
		
		
		
		
		
		
		
		
		Map<Character,Integer> mp2=new TreeMap<Character,Integer>();
		mp2.put('A',65);
		mp2.put('B',66);
		mp2.put('C',67);
		//System.out.println(mp2);
		
		
		/*for (Map.Entry<Character, Integer> k3 : mp2.entrySet()) { 
			
			System.out.println(k3.getKey());
			System.out.println(k3.getValue());
			System.out.println("**************************");
		}
		*/
		
		
		
	}

}
