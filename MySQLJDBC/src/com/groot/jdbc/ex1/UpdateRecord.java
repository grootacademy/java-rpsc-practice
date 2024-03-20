package com.groot.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class UpdateRecord {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("class loaded");
				Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/groot", "root", "root");
				Statement stmt= conn.createStatement();
				System.out.println("Connection done");
				int i=stmt.executeUpdate("delete from emp where id=3");
				System.out.println("query exected "+i);
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			System.out.println("After exception");
		}
}
