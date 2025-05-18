package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Q6_DeleteStudent {
    public static void delete(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Student deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
