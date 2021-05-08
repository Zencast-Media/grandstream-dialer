/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rickm
 */
package com.magicmindtechnologies.dialer;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSQLiteConnection {

    
    /**
     * Connect to a sample database
     * @return 
     */
    public static Connection connect() throws ClassNotFoundException {
      Connection conn;   
        try {
            // db parameters
            String url = "jdbc:sqlite:dialer.db";
            // create a connection to the database
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            
            //System.out.println("Connection to SQLite has been established.");
            return conn;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
    }
    

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

