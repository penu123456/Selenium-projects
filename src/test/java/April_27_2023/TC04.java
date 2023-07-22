package April_27_2023;

public class TC04 implements Products{

	public static void main(String[] args) {

		Products p1=new TC04();
		p1.Hello4();
		p1.Hello5();

	}

	@Override
	public void Hello4() {
		
		System.out.println("Hello4");
		
	}

	@Override
	public void Hello5() {
		
		System.out.println("Hello5");
		
	}

}
