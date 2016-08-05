/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import db.Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladimir
 */
public class EmployeDAO {
    public void insert(Employe e){
        try {
            Connection conn = Db.getConnection();
            PreparedStatement st = conn.prepareStatement("INSERT INTO employe values (null,?, ?, ?,?)");
            st.setString(1, e.getName());
            st.setInt(2, e.getAge());
            st.setString(3, e.getAddress());
            st.setDouble(4, e.getIncome());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
