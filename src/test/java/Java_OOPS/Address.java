package Java_OOPS;

public class Address {
	
private	String AddressLine1,AddressLine2,City,State,Country;

public String getAddressLine1() {
	return AddressLine1;
}

public void setAddressLine1(String addressLine1) {
	AddressLine1 = addressLine1;
}

public String getAddressLine2() {
	return AddressLine2;
}

public void setAddressLine2(String addressLine2) {
	AddressLine2 = addressLine2;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getState() {
	return State;
}

public void setState(String state) {
	State = state;
}

public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}
	

public void AddressInforma()
{
	System.out.println("AddressLine1: "+AddressLine1);
	System.out.println("AddressLine2 : "+AddressLine2);
	System.out.println("City  :"+City);
	System.out.println("State :"+State);
	System.out.println("Country :"+Country);
}


}
