import java.sql.*;
import java.util.Scanner;

public class JdbcTable {
public static void main(String [] args)  {
Connection con=null;
Statement stmt=null;
PreparedStatement pstmt=null;
Scanner sc=new Scanner(System.in);
//String create="create table Emp1 (emp_id int,emp_name varchar(20),emp_designation varchar(20),emp_aadhar varchar(16))";
//String insert="insert into Emp1 values(?,?,?,?)";
int emp_id;
String emp_name,emp_designation,emp_aadhar;
int ch=1;
while(ch==1)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Michu@15$45");
System.out.println("enter the emp_id");
emp_id=sc.nextInt();
sc.nextLine();
System.out.println("enter the emp_name");
emp_name=sc.nextLine();
System.out.println("enter the emp_designation");
emp_designation=sc.nextLine();
System.out.println("enter the emp_aadhar");
emp_aadhar=sc.nextLine();
pstmt=con.prepareStatement("insert into Emp1 values(?,?,?,?)");
pstmt.setInt(1, emp_id);
pstmt.setString(2, emp_name);
pstmt.setString(3, emp_designation);
pstmt.setString(4, emp_aadhar);
pstmt.executeUpdate();
}
catch(Exception e)
{
System.out.println(e);
}
finally {
try {
if(con!=null) {
con.close();
}}
catch(SQLException e){

}
}
System.out.println("if you want to continue and add a new row press 1 ");
ch=sc.nextInt();
sc.nextLine();
}
}

}




