package Connection;
import java.sql.*;
import FrontEnd.*;
public class PLConn {
    public static int a;
    public static void main() {
        String uid = Frame1.t1.getText();
        char[] password = Frame1.p1.getPassword();
        String cpassword = String.valueOf(password);

    try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbform","root","rootroot");
        
        String sql = "select ppassword from login_p where pid = ? ;" ;
	    PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,uid);
        ResultSet rs=stmt.executeQuery(); 
        rs.next();
        String pass = rs.getString("ppassword");
        //System.out.println(pass);
        
        if(cpassword.equals(pass))
        {
            a = 1;
        }
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }  
    
}
}

