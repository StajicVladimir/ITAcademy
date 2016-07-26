/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication82;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vladimir
 */
public class JavaApplication82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
         Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost/movies_g4","root","Fanta82ns");
         ResultSet rs = conn.createStatement().executeQuery("Select * from zanrovi");
         
         while (rs.next()){
             System.out.println(rs.getString("name"));
         }
    }
    
}
