package InheritanceAA;

public class B1 implements A1,A2 {

	public static void main(String[] args) {
		
		A1 a1=new B1();
		A2 a2=new B1();
		
		a1.A1();
		a2.A2();

	}

	@Override
	public void A2() {

		System.out.println("A2.......");
		
	}

	@Override
	public void A1() {
		System.out.println("A1.......");
		
	}

}
