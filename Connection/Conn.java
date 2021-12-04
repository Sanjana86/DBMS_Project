package Conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import Front.*;
 public class Conn{  
public static void main(){	
String name =  SignUpFrame.t1.getText();
String rollno = SignUpFrame.t3.getText();
String email = SignUpFrame.t2.getText();
String password = SignUpFrame.t5.getText();
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");

	String sql = "INSERT INTO login_s values (?,?,?,?)" ;
	PreparedStatement stmt=con.prepareStatement(sql);
	stmt.setString(1, name);
	stmt.setString(2, rollno);
	stmt.setString(3, email);
	stmt.setString(4, password);
	stmt.executeUpdate();
	
	stmt.close();
	con.close();
	//System.out.println("Success");
}catch(Exception e){System.out.println("Error"); }  
}  
} 