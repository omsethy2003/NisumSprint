package com.jdbc.assignment;

import java.sql.*;

public class Q7_SearchStudentLike {
    public static void search(String keyword) {
        String sql = "SELECT * FROM students WHERE name LIKE ?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, keyword + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
