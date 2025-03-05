package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp1 {
	public static void main(String args[]) {
		try {
			//Load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//Create connection object
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newDB", "root", "root@39");
			
			//Create statement object
			Statement stmt=con.createStatement();
			
			//SQL query
			//String sql="create table movies(id int, m_name varchar(50), m_price int)";
			//String sql= "insert into movies values(101, 'King', 1230)";
			//Student std=new Student(306, "Alice", "alice@gmail.com");
			//String sql="insert into student values("+std.getStd_id()+", '"+std.getStd_name()+"', '"+std.getStd_email()+"')";
			
			
			
			//Execute query
			//stmt.execute(sql);
			
			System.out.println("Done");
			
			//close the connection object
			//con.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
