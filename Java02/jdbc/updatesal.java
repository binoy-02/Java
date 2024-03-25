package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updatesal {
	public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","Thottathil1");
            Statement stmt = con.createStatement();
            PreparedStatement pst=con.prepareStatement("update emp1 set esal=? where eno=?");  
            pst.setInt(1,15000);//1 specifies the first parameter in the query i.e. name  
            pst.setString(2,"e1");  
              
            int i=pst.executeUpdate();  
            System.out.println(i+" records updated");  

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
