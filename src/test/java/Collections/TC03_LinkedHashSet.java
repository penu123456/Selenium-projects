package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TC03_LinkedHashSet {

	public static void main(String[] args) {
		
		Set<Integer> s1=new LinkedHashSet<Integer>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(10);
		s1.add(56);
		s1.add(16);
		
		System.out.println(s1);

	}

}
