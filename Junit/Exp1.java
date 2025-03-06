package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Exp1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/junit", "root", "root@39");
			Statement stmt=con.createStatement();
			String sql1="insert into student values(1, 'Robert', 'robert@gmail.com')";
			String sql2="insert into student values(2, 'Bob', 'bob@gmail.com')";
			String sql3="insert into student values(3, 'Alice', 'alice@gmail.com')";
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.executeBatch();
			
			String sql11="insert into student values(?, ?, ?)";
			PreparedStatement pst=con.prepareStatement(sql11);
			pst.setInt(1, 4);
			pst.setString(2, "Radha");
			pst.setString(3, "radha@gmail.com");
			pst.addBatch();
			pst.executeBatch();
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
