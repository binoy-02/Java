package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class Dptemp {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "hr", "Thottathil1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT e.eno, e.ename, e.esal, d.dname, d.dloc FROM emp1 e, dpt d WHERE e.dno = d.dno");
            
            ResultSetMetaData md = rs.getMetaData();

            for (int i = 1; i <= md.getColumnCount(); i++) {
                System.out.print(" " + md.getColumnName(i));
            }
            System.out.println("\n");
            System.out.println("-----------------------------------------------------------");

            int rowCount = 0;	
            while (rs.next()) {
                rowCount++;
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println("\n");
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
