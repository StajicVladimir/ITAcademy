/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vladimir
 */
public class Impression {
    private int id;
    private String username;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    //********** All impressions... this should be in a separate class but... 
    public static String allImpressions () throws ClassNotFoundException{
        StringBuilder all_impressions = new StringBuilder();
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/guestbook", "root", "Fanta82ns");){
            Statement st = conn.createStatement();
            st.executeQuery("SELECT username, text FROM impression");
            ResultSet rs = st.getResultSet();
            
            while (rs.next()){
                all_impressions.append(rs.getString("username"));
                all_impressions.append(": ");
                all_impressions.append(rs.getString("text"));
                all_impressions.append("\n");
            }
        }catch(SQLException ex){
            all_impressions.append(ex.getMessage());
        }
        
        return all_impressions.toString();
    }
    
    public void insertImpresion () throws ClassNotFoundException{
        
        Class.forName("com.mysql.jdbc.Driver");
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/guestbook",
                "root","Fanta82ns");){
            if (username!=null && !(username.isEmpty()) && text!=null && !(text.isEmpty())){
                Statement st = conn.createStatement();
                st.execute("INSERT INTO impression (username,text) VALUES ('" +username +"','"+text+"')");
                
            }
        }  catch(SQLException ex){
            System.out.println("Database connection error "+ ex.getMessage());
        }
    }
}
