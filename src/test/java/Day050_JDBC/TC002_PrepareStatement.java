package Day050_JDBC;

import java.awt.Point;
import java.sql.*;
import java.util.HashMap;  

class TC002_PrepareStatement{  
	
	public static void main(String args[]){  
		try{  
		
	//	Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/sakila","root","Admin123");  
		
	//	PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");  
		
		int country_id=23;
		
		PreparedStatement  stmt = con.prepareStatement(
                 "SELECT country_id,country from country WHERE  country_id = " + country_id);
		
	//	stmt.setInt(1,101);//1 specifies the first parameter in the query  
	//	stmt.setString(2,"Ratan");  
		  
		ResultSet rs=stmt.executeQuery();  
		
			while(rs.next())  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			
				}
			
			rs.close();
			stmt.close();
			con.close();  
		
		}catch(Exception e){ System.out.println(e);
		
	}  
		
}  


		




}  