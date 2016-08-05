/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormexample1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladimir
 */
public class WeaponDAO {
    public void insert(Weapon w) throws SQLException{
        Connection conn = Db.getConnection();
        PreparedStatement st = conn.prepareStatement("INSERT INTO weapons values (null,?)");
        st.setString(1, w.name);
        st.execute();
    }
    
    public void update(Weapon w) throws SQLException{
        Connection conn = Db.getConnection();
        PreparedStatement st = conn.prepareStatement("UPDATE weapons SET name = ? WHERE id = ?");
        st.setString(1, w.name);
        st.setInt(2, w.id);
        st.execute();
    }
    
    public void delete(int id) throws SQLException{
        Connection conn = Db.getConnection();
        PreparedStatement st = conn.prepareStatement("DELETE FROM weapons WHERE id = ?");
        st.setInt(1, id);
        st.execute();
    }
    
    public Weapon get( int id){
        
        try {
            Connection conn = Db.getConnection();
            PreparedStatement st;
            st = conn.prepareStatement("SELECT * FROM weapons WHERE id = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Weapon w = new Weapon();
                w.id = rs.getInt("id");
                w.name = rs.getString("name");
                return w;
            }else
                return null;
        } catch (SQLException ex) {
            Logger.getLogger(WeaponDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
    }
    public List<Weapon> getAll() throws SQLException{
       
        List<Weapon> weapons = new ArrayList<Weapon>();
        
        Connection conn = Db.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM weapons");
        while(rs.next()){
            Weapon w = new Weapon();
            w.name = rs.getString("name");
            w.id = rs.getInt("id");
            PlayerDAO pDAO = new PlayerDAO();
            w.players=pDAO.getAll("");
            weapons.add(w);
            
        }
        return weapons;
    }
}
