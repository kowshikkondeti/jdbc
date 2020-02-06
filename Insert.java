package insertjdbc;
import java.sql.*;
public class Insert {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db2","root","Michu@15$45");  
			
			Statement stmt = con.createStatement();  
			  
			int worke_id = 400;
			String first_name = "swati";
		    String last_name = "geerlakunta";
		    int salary = 50000;
		    String sql = "INSERT INTO worker (worke_id, first_name, last_name, salary)" + 
		                       "VALUES ("+worke_id+", '"+first_name+"',+'"+last_name+"',+"+salary+")";
		    
		    stmt.executeUpdate(sql);
						
			System.out.println("Done !!!!!!!!");
			}
		catch(Exception e)
		{
				System.out.println(e);
			} 

	}

}
