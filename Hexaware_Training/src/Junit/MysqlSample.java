package Junit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlSample {

    // Method to handle the database insertion logic
    public void databaseInsert(String id, String name) throws ClassNotFoundException, SQLException {
        // Load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver class loaded");

        // Get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore_management", "root", "1234");
        System.out.println("I got the connection");

        // Create a statement and execute the query
        Statement statement = connection.createStatement();
        int x = statement.executeUpdate("INSERT INTO author VALUES(" + id + ",'" + name + "')");

        // Display how many rows were inserted
        System.out.println(x + " row(s) inserted");

        // Close the connection
        connection.close();
    }
}