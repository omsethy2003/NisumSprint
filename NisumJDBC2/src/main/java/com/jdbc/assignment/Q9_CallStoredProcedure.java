//package com.jdbc.assignment;
//
//import java.sql.*;
//
//public class Q9_CallStoredProcedure {
//    public static void call(int id) {
//        String sql = "{call getStudentById(?)}";
//        try (Connection con = DBConnection.getConnection(); CallableStatement cs = con.prepareCall(sql)) {
//            cs.setInt(1, id);
//            ResultSet rs = cs.executeQuery();
//            while (rs.next()) {
//                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}