package Day044_Return_Values;

//https://www.geeksforgeeks.org/multidimensional-arrays-in-java/

public class TC003_Double_Array {
	
	 public static void main(String[] args) 
	    { 
	  
	        int[][] arr = { { 1, 2 }, { 3, 4 } }; 
	  
	        for (int i = 0; i < 2; i++) 
	            for (int j = 0; j < 2; j++) 
	                System.out.println("arr[" + i + "][" + j + "] = "
	                                   + arr[i][j]); 
	    } 

}
