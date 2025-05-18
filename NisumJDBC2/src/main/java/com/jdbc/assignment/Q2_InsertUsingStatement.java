package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.Statement;

public class Q2_InsertUsingStatement {
    public static void insert(int id, String name, int age) {
        String sql = "INSERT INTO students(id, name, age) VALUES (" + id + ", '" + name + "', " + age + ")";
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Inserted successfully using Statement.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
