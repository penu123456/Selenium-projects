package Java_MultipleIneritance;

public class C implements A,B {

	public static void main(String[] args) {
		
		A a1= new C();
		a1.HelloA();
		
		B b1=new C();
		b1.HelloB();

	}

	@Override
	public void HelloB() {

     System.out.println(" I am belongs to B");
		
	}

	@Override
	public void HelloA() {
	    System.out.println(" I am belongs to A");
		
	}

}
