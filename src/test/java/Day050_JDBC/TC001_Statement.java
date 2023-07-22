package Day050_JDBC;

import java.awt.Point;
import java.sql.*;
import java.util.HashMap;  

class TC001_Statement{  
	
	
public static void main(String args[]){  
	
		try{  
					//Class.forName("com.mysql.jdbc.Driver"); 
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/sakila","root","Admin123");  
					//here sonoo is database name, root is username and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from country");  
					
					
						while(rs.next())  
						{
						System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
						}
						con.close();  
						
			}catch(Exception e){ System.out.println(e);}  
		
		
		}  



		




}  