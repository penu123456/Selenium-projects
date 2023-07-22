package April_27_2023;

public class TC05_Poly {
	
	public static void main(String[] args) {

		TC05_Poly T1=new TC05_Poly();
		T1.Hello();
		T1.Hello("asdasd");
		T1.Hello("asdasd","sdfsdf");

	}
	
	
	public void Hello()
	{
		System.out.println("Hello");
	}
	
	public void Hello(String str1)
	{
		System.out.println(str1);
	}
	
	
	public void Hello(String str1,String str2)
	{
		System.out.println(str1);
		System.out.println(str2);
	}

}
