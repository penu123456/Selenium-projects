package Java_OOPS;

public class TC04_Address {

	public static void main(String[] args) {
		
		
		Address A1=new Address();
		
		A1.setCity("Hyderabad");
		A1.setState("Telangana");
		A1.setCountry("India");
		A1.setAddressLine1("Miyapur");
		A1.setAddressLine2("Near Bommarillu Function Hal");
		
		A1.AddressInforma();
		
		
		System.out.println("A1 City info  : "+A1.getCity());
		System.out.println("A1 Country info  : "+A1.getCountry());
		
		Address A2=new Address();
		A2.AddressInforma();

	}

}
