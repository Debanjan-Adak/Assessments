package com.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Jdbc {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "De@101103";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, username, password);
			st = con.createStatement();
			
//			st.executeUpdate("Insert INTO students (name, email, age) VALUES ('Deb', 'adakd@1234','22'); ");
			st.executeUpdate("DELETE FROM students where name='Deb';");
			rs = st.executeQuery("SELECT * FROM students");
			while (rs.next()) {
				System.out.println(rs.getString("name") + "," + rs.getInt("student_id") + "," + rs.getInt("age") + "," + rs.getInt(4));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
