package com.groot.jdbc.usingPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/groot", "root","root");
			PreparedStatement ps=conn.prepareStatement("insert into emp (name,salary,designation) values(?,?,?);");
			ps.setString(1, "jai singh");
			ps.setFloat(2, 3847.8f);
			ps.setString(3, "developer");
			int i=ps.executeUpdate();
			System.out.println(i);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
