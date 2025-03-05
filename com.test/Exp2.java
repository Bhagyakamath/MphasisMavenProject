package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp2 {
	public static void main(String args[]) {
		try {
			//Load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//Create connection object
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newDB", "root", "root@39");
			
			//Create statement object
			Statement stmt=con.createStatement();
			
			//SQL query
			//String sql="create table employess(id int, name varchar(50), email varchar(50), city varchar(50))";
			//String sql="insert into employess values(1, 'John', 'john@email.com', 'Chennai'),(2, 'Bob', 'bob@email.com', 'Chennai'), (3, 'Alice', 'alice@email.com', 'Chennai'), (4, 'Dennis', 'dennis@email.com', 'Chennai'),(5, 'Robert', 'robert@email.com', 'Chennai')";
			//String sql="insert into employess values(6, 'Kris', 'kris@email.com', 'Bangalore'),(7, 'Ram', 'ram@email.com', 'Delhi'), (8, 'Nayana', 'nayana@email.com', 'Pune'), (9, 'Rahul', 'rahul@email.com', 'Hyderabad'),(10, 'Kohli', 'kohli@email.com', 'Pune')";
			//String sql="update employess set name='Pranjali', email='pranjali@email.com', city='Mandi' where id=1";
			String sql="delete from employess where id=9";
			
			//Execute query
			stmt.execute(sql);
			
			System.out.println("Done");
			
			//close the connection object
			//con.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
