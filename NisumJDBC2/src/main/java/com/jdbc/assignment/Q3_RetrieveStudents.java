package com.jdbc.assignment;

import java.sql.*;

public class Q3_RetrieveStudents {
    public static void retrieve() {
        String sql = "SELECT * FROM students";
        try (Connection con = DBConnection.getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}