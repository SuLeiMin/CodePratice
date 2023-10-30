package org.example.JDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.*;

public class ConnectionDemo {

    static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT id,shopNo,shopType,address FROM shop";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.println("id: " + rs.getInt("id"));
                System.out.println(", shopNo: " + rs.getString("shopNo"));
                System.out.println(", shopType: " + rs.getString("shopType"));
                System.out.println(", address: " + rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


