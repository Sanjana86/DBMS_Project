package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import FrontEnd.*;
public class PConn{  
public static void main(){	
String name =  ProfFrame.t1.getText();
String rollno = ProfFrame.t3.getText();
String email = ProfFrame.t2.getText();
char[] password = ProfFrame.p1.getPassword();
String pass = String.valueOf(password);
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");

	String sql = "INSERT INTO login_p values (?,?,?,?)" ;
	PreparedStatement stmt=con.prepareStatement(sql);
	stmt.setString(1, name);
	stmt.setString(2, rollno);
	stmt.setString(3, email);
	stmt.setString(4, pass);
	stmt.executeUpdate();
	
	stmt.close();
	con.close();
	System.out.println("Success");
}catch(Exception e){System.out.println("Error"); }  
}  
} 