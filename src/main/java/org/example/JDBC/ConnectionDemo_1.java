package org.example.JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo_1 {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo",
                    "root", "");

            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from product");
            String name;
            String price;
            while (resultSet.next()) {
                name = resultSet.getString("name").trim();
                price = resultSet.getString("price").trim();
                System.out.println("Name : " + name
                                    + "  Price : " + price);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends
}
