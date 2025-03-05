package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exp3 {

	public static void main(String[] args) {
		try {
		Student obj=new Student(50, "Jai", "jai@gmail.com");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newDB", "root", "root@39");
//		PreparedStatement pst=con.prepareStatement("insert into student values(?, ?, ?)");
//		pst.setInt(1, 101);
//		pst.setString(2, "Ravi");
//		pst.setString(3, "ravi@gmail.com");
//		pst.execute();
//		System.out.println("Done");
		
		/*String sql="update student set std_name=?, std_email=? where std_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, "Newname");
		pst.setString(2, "New@gmail.com");
		pst.setInt(3, 101);
		pst.execute();
		
		String sql="delete from student where std_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, 101);
		pst.execute();
		//pst.executeUpdate();*/
		
		String sql="select * from student";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
