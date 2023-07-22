package Day044_Return_Values;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class TC002_Return_Multiple_Values {
	
	@Test
	public void Test1()throws Exception
	{
		List<String> l2=new ArrayList<String>();
		
		TC002_Return_Multiple_Values T1= new TC002_Return_Multiple_Values();
		
		l2=T1.getMultipleValues("Welcome");
		
		System.out.println(l2);
		
		System.out.println(l2.get(0));
		System.out.println(l2.get(1));
		System.out.println(l2.get(2));
		
		
		
		
	    List<String> Page_li = new ArrayList<String>();
	    
	    Page_li=Page1();
	    
	  //  System.out.println(Arrays.toString(Page_li.toArray()));
	    
	    System.out.println("________________________");
	    
	    printList(Page_li);
	    
	   System.out.println("***********");
	    
	   printList1(Page_li);
	    
	}
	
	
	
	public  void printList(List<String> page_li) {
		
		 for(String elem : page_li){
		        System.out.println(elem+"  ");
		    }
		
	}



	public List<String> getMultipleValues(String str1) {
	
		List<String> l1=new ArrayList<String>();
		
		l1.add("Hello");
		l1.add("Hai");
		l1.add(str1);
		
	return l1;
		
		
	}



	public List<String> Page1()    {
		
	    List<String> Page_list1 = new ArrayList<String>();
	    
	    Page_list1.add("Order");
	    Page_list1.add("11");
	    Page_list1.add("Indian777");
	    
	    return(Page_list1);
	   
	   }
	
	
		/*public void printList(List<String> list){
			
			    for(String elem : list){
			        System.out.println(elem+"  ");
			    }
			    
			    
			    System.out.println(list.get(0));
			    System.out.println(list.get(1));
			    System.out.println(list.get(2));
			    
			}*/
		
		
		public  void printList1(List<String> list)
		{
		    for (int i=0; i<list.size(); i++)
		        System.out.println(list.get(i));
		}
		
		
		
		
		
		

}
