package Exam;

import java.util.HashSet;

import org.testng.annotations.Test;

public class NewTest {
  @Test

	public static void main (String[]args)
	{
		HashSet obj=new HashSet();
		obj.add("a");
		obj.add("b");
		obj.add("c");
		
		System.out.println(obj+""+obj.size());
	}
}
