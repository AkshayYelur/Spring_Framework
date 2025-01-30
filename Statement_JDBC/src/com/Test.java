package com;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {

        // Scanner for user input
        Scanner s = new Scanner(System.in);
        
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cjc", "root", "1234");

        // Create statement
        Statement smt = con.createStatement();
        
        // Loop to insert data for 10 iterations
        for (int i = 1; i <= 10; i++) {

            // Prompt user for id and name
            System.out.println("Enter id for record " + i + ":");
            int id = s.nextInt(); // ID
            
            s.nextLine(); // 

            System.out.println("Enter name for record " + i + ":");
            String name = s.nextLine(); // Read Name
            
            // Insert query
            String sql = "INSERT INTO student (id, name) VALUES (" + id + ", '" + name + "')";
            smt.execute(sql);
        }
        
        // Close statement and connection
        smt.close();
        con.close();

        System.out.println("Data Inserted Successfully....");
    }
}
