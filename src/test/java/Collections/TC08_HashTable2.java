package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class TC08_HashTable2 {

	public static void main(String[] args) {
		
		 Map<Integer, String> map = new Hashtable<>();
	        map.put(1, "One");
	        map.put(2, "Hello");
	        map.put(3, "four");
	        map.put(2, "Welcome");
	        //map.put(null, "Welcome1");
	      //  map.put(4, null);
	        
	        
		System.out.println(map);
		
		//1st approach
				Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
				
				while (itr.hasNext()) {
				    Map.Entry<Integer, String> mp = itr.next();
					System.out.println(mp.getKey());
					System.out.println(mp.getValue());
					System.out.println("__________________________");
				}
				
				
				
				
				//2nd approach for each value
				for (Map.Entry<Integer, String> mp : map.entrySet()) {    
					System.out.println(mp.getKey());
					System.out.println(mp.getValue());
					System.out.println("**************************");
				}
		
		
    }
		
		
	}


