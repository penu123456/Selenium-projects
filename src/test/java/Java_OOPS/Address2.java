package Java_OOPS;

public class Address2 {
	
String AddressLine1,AddressLine2,City,State,Country;

public void AddressInforma()
{
	System.out.println("AddressLine1: "+AddressLine1);
	System.out.println("AddressLine2 : "+AddressLine2);
	System.out.println("City  :"+City);
	System.out.println("State :"+State);
	System.out.println("Country :"+Country);
	
	System.out.println("________________");
}


Address2()
{
	System.out.println("Default Constructor");
}


Address2(String AddressLine1,String AddressLine2,String City,String State,String Country)
{
	
	this.AddressLine1=AddressLine1;
	this.AddressLine2=AddressLine2;
	this.City=City;
	this.State=State;
	this.Country=Country;
	
	System.out.println("Paameterized Constructor");
}



public static void main(String[] args) {
	
	Address2 P1=new Address2();
	Address2 P2=new Address2("Miyapur","Bommarillu","hyderabad","Telanagana","India");
	P2.AddressInforma();
	P1.AddressInforma();

}








}
