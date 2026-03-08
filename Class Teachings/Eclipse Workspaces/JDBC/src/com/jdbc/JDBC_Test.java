package com.jdbc;

import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;
public class JDBC_Test {
    public static void main(String[] args) {
    	String URL = "jdbc:mysql://localhost:3306/testdb";
        String USER = "root";
        String PASS = "12345678";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n1.Add 2.Update 3.Delete 4.View 5.Exit");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID, Name, Marks: ");
                        int id = sc.nextInt();
                        String name = sc.next();
                        double marks = sc.nextDouble();

                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO Student VALUES (?, ?, ?)");
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setDouble(3, marks);
                        ps1.executeUpdate();
                        System.out.println("Student Added!");
                        break;

                    case 2:
                        System.out.print("Enter ID & New Marks: ");
                        int uid = sc.nextInt();
                        double newMarks = sc.nextDouble();

                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE Student SET marks=? WHERE id=?");
                        ps2.setDouble(1, newMarks);
                        ps2.setInt(2, uid);
                        ps2.executeUpdate();
                        System.out.println("Updated!");
                        break;

                    case 3:
                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM Student WHERE id=?");
                        ps3.setInt(1, did);
                        ps3.executeUpdate();
                        System.out.println("Deleted!");
                        break;

                    case 4:
                        PreparedStatement ps4 = con.prepareStatement(
                                "SELECT * FROM Student");
                        ResultSet rs = ps4.executeQuery();

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt("id") + " " +
                                    rs.getString("name") + " " +
                                    rs.getDouble("marks"));
                        }
                        break;

                    case 5:
                        System.exit(0);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}