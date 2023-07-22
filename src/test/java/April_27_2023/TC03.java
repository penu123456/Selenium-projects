package April_27_2023;

public class TC03 extends TC02_Hello {
	

	public static void main(String[] args) {
	
		TC02_Hello T1= new TC03();
		T1.Hello();
		T1.Hello1();

	}

	@Override
	public void Hello() {
		
		System.out.println("Hello");
		
	}

	@Override
	public void Hello1() {
		
		System.out.println("Hello1");
		
	}

}
