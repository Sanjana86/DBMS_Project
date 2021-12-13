package Connection;
import java.sql.*;
import FrontEnd.*;
public class DQ4Conn {
    public static float q4;
    public static String q_4, sub = PrFrame.sub1;
    public static void main() {
    
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
            
            String sql = "select avg(q4) as avg from form where sub_code = ? " ;
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,sub);
            ResultSet rs=stmt.executeQuery(); 
            rs.next();
            q4 = rs.getFloat("avg");
           // System.out.println(q4);
            q_4 = String.valueOf(q4);  
           stmt.close();
        con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }  
    }
}
