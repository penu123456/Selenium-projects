package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TC02_TreeSet {

	public static void main(String[] args) {
		
		Set<Integer> s1=new TreeSet<Integer>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(10);
		s1.add(56);
		s1.add(null);
		
		System.out.println(s1);

	}

}
