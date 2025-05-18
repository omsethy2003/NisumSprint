package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Q4_InsertUsingPreparedStatement {
    public static void insert(int id, String name, int age) {
        String sql = "INSERT INTO students(id, name, age) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.executeUpdate();
            System.out.println("Inserted using PreparedStatement.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}