package com.groot.jdbc.ex1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class insertByUser {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("class loaded");
				Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/groot", "root", "root");
				Statement stmt= conn.createStatement();
				System.out.println("Connection done");
				Scanner sc=new Scanner(System.in);
				System.out.println("Please enter your name :");
				String name=sc.next();
				System.out.println("Please enter your salary");
				float salary=sc.nextFloat();
				System.out.println("Please enter your designation :: ");
//				sc.skip("R");
				String designation=sc.next();
				int i=stmt.executeUpdate("insert into emp (name,salary,designation) values('"+name+"',"+salary+",'"+designation+"')");
				System.out.println("query exected "+i);
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			System.out.println("After exception");
		}
}
