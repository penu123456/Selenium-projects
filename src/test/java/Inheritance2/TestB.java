package Inheritance2;

import Inheritance1.TestA;

public class TestB extends TestA {
	
	
	public void TestMethod2()
	{
		System.out.println("Hai I am from TestB method");
	}
	
	public static void main(String[] args)
	{
		TestA a1=new TestA();
		a1.TestMethod1();
	}
	
	

}
