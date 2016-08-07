/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vladimir
 */
public class Db {
    private static Connection conn;
    
    public static Connection getConnection() throws SQLException{
        if (conn == null){
            conn = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
        }
        return conn;
    }
}
