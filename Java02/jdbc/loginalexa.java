package jdbc;

import java.sql.*;

public class loginalexa {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "hr", "Thottathil1");
            
            String username = "alexa";
            String password = "siri123#";
            String query = "SELECT COUNT(*) FROM login WHERE username = '" + username + "' AND password = '" + password + "'";
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
           
            rs.next();
            int count = rs.getInt(1);
            
            if (count > 0) {
                System.out.println("Record found for username 'alexa' and password 'siri123#'");
            } else {
                System.out.println("No record found for username 'alexa' and password 'siri123#'");
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
           
        }
    }
}

