package CoreJava;

public class Test131 implements Test130 {

	public static void main(String[] args) {

		Test130 T1=new Test131();
		T1.Welcome1();
		T1.Welcome2();
		
	}

	@Override
	public void Welcome1() {
		
		System.out.println("Welcome1");
		
		
	}

	@Override
	public void Welcome2() {

		System.out.println("Welcome2");
	}

}
