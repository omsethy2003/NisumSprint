package com.jdbc.assignment;

import java.sql.Connection;

public class Q1_ConnectDB {
    public static void connect() {
        try (Connection con = DBConnection.getConnection()) {
            System.out.println("Database connection successful!");
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
