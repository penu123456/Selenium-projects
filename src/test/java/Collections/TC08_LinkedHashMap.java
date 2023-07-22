package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class TC08_LinkedHashMap {

	public static void main(String[] args) {
		
	
		
		Map<Integer,String> s2=new LinkedHashMap<Integer,String>();
		s2.put(10,"Kiran");
        s2.put(20,"Ravi");
        s2.put(30,"Venkat");
        s2.put(40,"Venkat");
        s2.put(40,null);
        s2.put(null,"Hari");

		System.out.println(s2);
	}

}
