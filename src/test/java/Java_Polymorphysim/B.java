package Java_Polymorphysim;

public class B extends A {

	public static void main(String[] args) {
	
		A a1=new B();
	
		a1.Hello();
		a1.Hai();

	}

	@Override
	public void Hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello from Class B");
	}

	@Override
	public void Hai() {
		// TODO Auto-generated method stub
		System.out.println("Hai from Class B");
	}

	

}
