package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.Statement;

public class Q8_TransactionExample {
    public static void execute() {
        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO students(id, name, age) VALUES (100, 'Trans_Student', 30)");
            stmt.executeUpdate("INSERT INTO logs(id, info) VALUES (100, 'Inserted student with ID 100')");

            con.commit();
            System.out.println("Transaction committed successfully.");
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
            try (Connection con = DBConnection.getConnection()) {
                con.rollback();
                System.out.println("Transaction rolled back.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}