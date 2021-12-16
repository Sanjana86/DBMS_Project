package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import FrontEnd.*;
public class Conn{  
public static void main(){	
String name =  SignUpFrame.t1.getText();
String rollno = SignUpFrame.t3.getText();
String email = SignUpFrame.t2.getText();
char[] password = SignUpFrame.p1.getPassword();
String pass = String.valueOf(password);
String uid = SignUpFrame.t4.getText();


try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");

	String sql = "INSERT INTO login_s values (?,?,?,?,?)" ;
	PreparedStatement stmt=con.prepareStatement(sql);
	stmt.setString(1, name);
	stmt.setString(2, uid);
	stmt.setString(3, rollno);
	stmt.setString(4, email);
	stmt.setString(5, pass);
	stmt.executeUpdate();
	
	stmt.close();
	con.close();
	//System.out.println("Success");
}catch(Exception e){System.out.println("Error"); }  
}  
} 