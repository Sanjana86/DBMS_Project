package Connection;
import java.sql.*;
import FrontEnd.*;
public class SCConn {
    public static String pid = PrFrame.pid;
    public static int num;
    public static void main() {
    
    try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
        
        String sql = "select count(code) as num from subject where prof_id = ? ;" ;
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,pid);
        ResultSet rs=stmt.executeQuery(); 
        rs.next();
        num = rs.getInt("num");
        //System.out.println(num);
	con.close();
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }  
        
    }
    


    
}
