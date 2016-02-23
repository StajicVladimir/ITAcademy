/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prva_baza;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladimir
 */
public class Prva_baza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/test_database", "test_user", "root");
            
            java.sql.Statement stInsert= conn.createStatement();
            stInsert.execute("INSERT INTO users (username, password) VALUES ('Jovan', 'root')");
            
            java.sql.Statement stFetch = conn.createStatement();
            ResultSet rs = stFetch.executeQuery("SELECT * FROM users");
            
            while(rs.next()){
                System.out.println("User: ");
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Password: "+rs.getString("password"));
                System.out.println("\n");
            }
            
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(Prva_baza.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Greska prilikom konektovanja na bazu podataka!!" + ex.getMessage());
        }
        
    }
    
}
