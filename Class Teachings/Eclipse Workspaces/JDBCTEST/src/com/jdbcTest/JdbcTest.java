package com.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "De@101103";
		try {
			
			//1. load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2 estb the connection
			con = DriverManager.getConnection(url, username, password);
			
			//3. Create Statement
			st = con.createStatement();
			
			//4. execute the Query
			
//			st.executeUpdate("insert into students (email, name, age) values ( 'absc@1234','Amar', 23 )");
			rs = st.executeQuery("SELECT * FROM students");
			//5. process the result
			while (rs.next()) {
				System.out.println(
							rs.getInt("student_id") + " " +
							rs.getString("name") + " " +
							rs.getString("email") + " " +
							rs.getString("age")
						);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
