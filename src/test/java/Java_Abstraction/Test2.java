package Java_Abstraction;

public class Test2 extends Test1_Abstract {

	@Override
	public void Hello() {

     System.out.println("Hello");
		
	}

	@Override
	public void Hai() {
		// TODO Auto-generated method stub
		System.out.println("Hai");
	}
	
   public static void main(String[] args) throws Exception {
		
	   Test1_Abstract t1=new Test2();
		t1.Hai();
		t1.Hello();
		
	}


}
