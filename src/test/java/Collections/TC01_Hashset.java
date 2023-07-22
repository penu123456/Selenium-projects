package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TC01_Hashset {

	public static void main(String[] args) {
		
		//int a=10;float b=10;
		//Integer a1=20;Float b1=20.00f;
		
		Set<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(10);
		s1.add(10);
		s1.add(56);
		s1.add(16);
		System.out.println(s1); // [10, 20, 30, 56, 16]
		
		//1st approach getting values by using iterator
		Iterator<Integer> i1=s1.iterator();
		while(i1.hasNext())
		{
			Integer a1=i1.next();
			System.out.print(a1+" ");
			
		}
		
		System.out.println();
		
		//2nd approach foreach loop
		for(Integer a1:s1)
			System.out.print(a1+"..");
		
			
		
		

	}

}
