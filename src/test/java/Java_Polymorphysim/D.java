package Java_Polymorphysim;

public class D extends C{

	public static void main(String[] args) {
	
		C c1= new D();
		c1.Hello();
		c1.Hai();

	}
	
public  void Hello(){
		
		System.out.println("Hello from Class D");
		
	}
	
	
	public  void Hai() {
		
		System.out.println("Hai from Class D");
	}





	

}
