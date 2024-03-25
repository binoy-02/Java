package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ooc1 {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "hr", "Thottathil1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from person");
            while(rs.next()) {
            	System.out.println(rs.getString(1));
            	System.out.println(rs.getString(2));
            	System.out.println(rs.getInt(3));
            	System.out.println(rs.getString(4));
            	System.out.println(rs.getInt(5));
            	
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
