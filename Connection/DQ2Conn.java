package Connection;
import java.sql.*;
import FrontEnd.*;
public class DQ2Conn {
    public static float q2;
    public static String q_2, sub = PrFrame.sub1;
    public static void main() {
    
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
            
            String sql = "select avg(q2) as avg from form where sub_code = ? " ;
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,sub);
            ResultSet rs=stmt.executeQuery(); 
            rs.next();
            q2 = rs.getFloat("avg");
            //System.out.println(q2);
            q_2 = String.valueOf(q2);  
           stmt.close();
        con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }  
    }
}
