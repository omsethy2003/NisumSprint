package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Q5_UpdateStudent {
    public static void update(int id, String newName) {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Student updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}