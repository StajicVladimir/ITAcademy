/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication81;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vladimir
 */
public class JavaApplication81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/movies_g4", "root", "Fanta82ns");
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM zanrovi");
        
        while (rs.next()){
            System.out.println("Zanr: " + rs.getString("name"));
        }
    }
    
}
