package Connection;
import java.sql.*;
import FrontEnd.*;

public class FConn {
    public static String sid = Frame1.t1.getText();
    public static String q_1 = FeedBack.t5.getText();
    public static String q_2 = FeedBack.t6.getText();
    public static String q_3 = FeedBack.t7.getText();
    public static  String subcode = FeedBack.sub;
    public static int q1 = Integer.parseInt(q_1);
    public static int q2 = Integer.parseInt(q_2);
    public static int q3 = Integer.parseInt(q_3);
    public static String suggestions = FeedBack.t4.getText();
    
    public static void main() {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
            
            String sql = "INSERT INTO form values (?,?,?,?,?,?)" ;

	        PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1, sid);
            stmt.setString(2, subcode);
            stmt.setInt(3, q1);
            stmt.setInt(4, q2);
            stmt.setInt(5, q3);
            stmt.setString(6, suggestions);
            stmt.executeUpdate();

            stmt.close();
	        con.close();
	        System.out.println("Success");
        }
        catch(Exception e){System.out.println("error in inserting");}   
        
    }
    
}
