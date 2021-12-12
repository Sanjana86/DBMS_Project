package Connection;
import java.sql.*;
import FrontEnd.*;

public class PNConn {
    public static String pname;
    public static String sub = SecondFrame.sub_code;
  
    public static void main() {
    
    try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
        
        String sql = "select login_p.pname from login_p inner join subject on login_p.pid=subject.prof_id where subject.code= ? ;" ;
	    PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,sub);
        ResultSet rs=stmt.executeQuery(); 
        rs.next();
        pname = rs.getString("pname");
        //System.out.println(pname);
       stmt.close();
	con.close();
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }  
        
    }
    
}
