package Connection;
import java.sql.*;
import FrontEnd.*;
public class DQ3Conn {
    public static float q3;
    public static String q_3, sub = PrFrame.sub1;
    public static void main() {
    
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
            
            String sql = "select avg(q3) as avg from form where sub_code = ? " ;
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,sub);
            ResultSet rs=stmt.executeQuery(); 
            rs.next();
            q3 = rs.getFloat("avg");
            //System.out.println(q3);
            q_3 = String.valueOf(q3);  
           stmt.close();
        con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }  
    }
    
}
