/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vladimir
 */
public class DbTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mailVar="Pera@google.com";
        String passVar= "Pera";
        try{
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jad", "root", "Fanta82ns");
            
            if(conn.isClosed()){
                System.out.println("Konekcija je zatvorena");
             
            }else{
                System.out.println("Konekcija je uspesno obavljena!");
            }
            /*PreparedStatement stUnos = conn.prepareStatement("INSERT INTO users (email, password) VALUES (?,?)");
            stUnos.setString(1,mailVar);
            stUnos.setString(2, passVar);
            stUnos.execute();*/
            
            /*PreparedStatement stBrisanje = conn.prepareStatement("DELETE FROM users WHERE user_id= ?");
            stBrisanje.setString(1, "3");
            stBrisanje.execute();*/
            
            
            java.sql.Statement st = conn.createStatement();
            
            st.execute("UPDATE users SET password='new password', email = 'new email' WHERE user_id=2");
            ResultSet rs = st.executeQuery("SELECT * FROM users");
            while(rs.next()){
                System.out.println("User: "+rs.getString("user_id")+"\n Mail: " + rs.getString("email")+" password: "+rs.getString("password")+"\n");
                
            }
            
        }catch(SQLException ex){
            System.out.println("Doslo je do greske prilikom konektovanja!" + ex.getMessage());
        }
    }
    
}
