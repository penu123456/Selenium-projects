package CoreJava;

public class Test125 extends Test124 {

	@Override
	public void Hello() {
		
		System.out.println("Hello");
	}

	@Override
	public void Hello1() {
		
		System.out.println("Hello1");
	}
	
	
	public static void main(String[] args) {
		
		Test124 T1=new Test125();
		T1.Hello();
		T1.Hello1();
		T1.Hello2();
	}
	

}
