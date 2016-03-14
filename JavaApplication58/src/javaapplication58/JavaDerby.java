/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

import java.sql.*;

/**
 *
 * @author Vladimir
 */
public class JavaDerby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection conn = DriverManager.getConnection("jdbc:derby:sminka;create=true");
        
        System.out.println(conn);
        //System.out.println(conn.isClosed());
       String nja=  (conn.isClosed())?"Konekcija nije otvorena":"konekcija je otvorena";
        System.out.println(nja);
        Statement st = conn.createStatement();
        
       // st.execute("INSERT INTO karmini (id,naziv,boja) VALUES (2,'Max Factor 123','Purple')");
        ResultSet rs = st.executeQuery("SELECT * FROM karmini");
        //rs.next();//move to first row
        System.out.println("ID\tnaziv\tboja\t");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));//Get column 1 ( or it's maybe better to use name)
        
        }
       
        
        
    }
    
}
