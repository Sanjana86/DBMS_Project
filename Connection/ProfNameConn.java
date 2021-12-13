package Connection;
import java.sql.*;
import FrontEnd.*;
public class ProfNameConn {
    public static String pass;
    public static void main() {
        String uid = Frame1.t1.getText();
    try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
        
        String sql = "select pname from login_p where pid = ? ;" ;
	    PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,uid);
        ResultSet rs=stmt.executeQuery(); 
        rs.next();
        pass = rs.getString("pname");
 
        stmt.close();
	con.close();
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }  
    
}
    
}
