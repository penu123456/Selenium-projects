package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TC04_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> s1=new LinkedList<Integer>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(10);
		s1.add(56);
		s1.add(16);
		
		System.out.println(s1);
		
		
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
