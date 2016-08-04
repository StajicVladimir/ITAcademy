/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormexample1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        PreparedStatement st = conn.prepareStatement("UPDATE weapons SET name = ? WHERE id = ?)");
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
}
