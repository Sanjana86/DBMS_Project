package Connection;
import java.sql.*;
import FrontEnd.*;
public class SubConn {
    public static String pid = Frame1.t1.getText();
    public static String subcode,subcode2;
    public static void main() {
        
    try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
        
        String sql = "select code from subject where prof_id = ?;" ;
	    PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,pid);
        ResultSet rs=stmt.executeQuery(); 
        rs.next();
        subcode = rs.getString("code");
        if(SCConn.num > 1)
        {
            rs.next();
            subcode2 = rs.getString("code");
        }
 
        stmt.close();
	con.close();
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }  
    
}
    
}
