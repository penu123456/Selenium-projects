package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TC07_Stack {

	public static void main(String[] args) {
		
		Stack <Integer> s1=new Stack<Integer>();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(10);
		s1.push(56);
		s1.push(16);
		
		s1.pop();
		s1.pop();
		System.out.println(s1);

	}

}
