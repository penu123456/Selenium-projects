package Java_Abstraction;

public class Test4 implements Test3{

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
		
		Test3 t3=new Test4();
		t3.Hai();
		t3.Hello();
		
		
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new IEDRIVERSERVER();
		//WebDriver driver=new FireFoxDriver()
		
		
	}

}
