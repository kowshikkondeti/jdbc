package jdbc.cts;
import java.sql.*;


public class Jdbcc{
	public static void main(String[] args) {
	/*Class.forName("com.mysql.cj.jdbc.Driver"); 
	Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sonoo","root","root"); */
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/db2","root","Michu@15$45");  
		  
  
		  
		Statement stmt=con.createStatement();  
		  
		ResultSet rs=stmt.executeQuery("select * from worker");  
		  
		while(rs.next())  
			
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		  
		con.close();  
		  
	}catch(Exception e){ System.out.println(e);
	} 
}
}

