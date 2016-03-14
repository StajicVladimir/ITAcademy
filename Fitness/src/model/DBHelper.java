/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author Vladimir
 */
public class DBHelper {
    Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost/fitness","root", "Fanta82ns");
    }
    
    public boolean delete(int id) throws SQLException{
        Connection conn = connect();
        PreparedStatement st = conn.prepareStatement("DELETE FROM rezultati WHERE id = ?");
        st.setInt(1,id);
        
        boolean res = st.getUpdateCount()>1;
        conn.close();
        return res;
    }
    public boolean update(Rezultat r) throws SQLException{
        Connection conn = connect();
        
        PreparedStatement st = conn.prepareStatement("update rezultati set ime=?, km=?,vreme=? where id = ?");
        st.setString(1,r.ime);
        st.setDouble(2,r.km);
        st.setInt(3, r.vreme);
        st.setInt(4,r.id);
        st.execute();
        boolean res = st.getUpdateCount()>0;
        
        conn.close();
        
        return res;
    }
    public boolean add(Rezultat r) throws SQLException{
        Connection conn = connect();
        
        PreparedStatement st = conn.prepareStatement("insert into rezultati values(null,?,?,?)");
        st.setString(1,r.ime);
        st.setDouble(2,r.km);
        st.setInt(3, r.vreme);
        st.execute();
        boolean res = st.getUpdateCount()>0;
        
        conn.close();
        
        return res;
    }
}
