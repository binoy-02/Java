package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddPerson {
	 public static void main(String args[]) {
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "hr", "Thottathil1");
	            Statement stmt = con.createStatement();
	            stmt.executeUpdate("insert into person values('P01','Binoy',21,'Alappuzha',2002)");
	            System.out.println("Value inserted...");
	            con.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println(e);
	        }
	    }

}

