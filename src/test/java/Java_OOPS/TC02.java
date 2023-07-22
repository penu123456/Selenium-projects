package Java_OOPS;

import org.openqa.selenium.WebDriver;

public class TC02 {
	


	public static void main(String[] args) {
		
		Jobs j1=new Jobs();
		j1.JobsData();
		
		j1.setJobTitle("Sales1");
		j1.setJobNote("Sales1 Note");
		j1.setJoDescr("Sales1 Descr");
		
		
		
		j1.JobsData();

	}
	
	
	
	
	
	
	
}
