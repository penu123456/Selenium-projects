package Amazon;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub 
		
		
		//getFloat_From_String("?23,980.00");
		
		String output = "?23,980.50".replace("?", "").replace(",", "");
		float f=Float.parseFloat(output);
		
		//float f=(float) ((23980.0)*(2));
		System.out.println(f);
	}
	
	
	public static  float getFloat_From_String(String str)
	{
		
		 float flt = 0;
		    //Creating a pattern to identify floats
		    Pattern pat = Pattern.compile("([-+]?[0-9]*,?[0-9]+)");
		    //matching the string with the pattern
		    java.util.regex.Matcher m = pat.matcher(str);
		    //extracting and storing the float values
		    while(m.find()) {
		      flt = Float.parseFloat(m.group());
		    }
		    //printing the float values
		    System.out.println("The float value from the string is:");
		                System.out.println(flt);
			
			return flt;
		
		
	}

}
