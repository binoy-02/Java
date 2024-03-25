package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dept {
	 public static void main(String args[]) {
    try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
Statement stmt = con.createStatement();
 stmt.executeUpdate("create table Deprtmnt(dno varchar2(20) primary key,dname varchar2(20),dloc varchar2(20))");
System.out.println("Table created...");
 con.close();
 } catch (Exception  e) {
System.out.println(e);
   } }
}

