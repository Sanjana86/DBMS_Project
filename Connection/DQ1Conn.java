package Connection;
import java.sql.*;
import FrontEnd.*;
public class DQ1Conn {
    public static float q1;
    public static String q_1, sub = PrFrame.sub1;
    public static void main() {
    
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
            
            String sql = "select avg(q1) as avg from form where sub_code = ? " ;
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,sub);
            ResultSet rs=stmt.executeQuery(); 
            rs.next();
            q1 = rs.getFloat("avg");
           // System.out.println(q1);
            q_1 = String.valueOf(q1);  
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }  
    }
}
