
import java.sql.*;
import java.util.*;

public class Student {

public static void main(String[] args) {
try {

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db1","root","Michu@15$45");

Statement stmt=con.createStatement();  

ArrayList<Student1> list = new ArrayList<Student1>();

ResultSet rs=stmt.executeQuery("select * from student1");
while(rs.next())  
{
Student1 r = new Student1(rs.getInt(1),rs.getString(2),rs.getBoolean(3));
list.add(r);
}

Iterator it = list.iterator();

while(it.hasNext())
{

Student1 ss = (Student1)it.next();

System.out.println( ss);
}

con.close();
}
catch(Exception e) {System.out.println(e);}

}
}

class Student1{

int sid;
String sname;
boolean flag;

public Student1(int sid, String sname, boolean flag) {

this.sid = sid;
this.sname = sname;
this.flag = flag;
}/*
@Override
public String toString() {
return "Student1 [sid=" + sid + ", sname=" + sname + ", flag=" + flag + "]";
}*/

@Override
public String toString() {
	return "Student1 [sid=" + sid + ", sname=" + sname + ", flag=" + flag + "]";
}
}




