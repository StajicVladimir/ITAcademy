/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormexample1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public class PlayerDAO {
    
    
    public List<Player> getAll(String filter) throws SQLException{
       
        List<Player> players = new ArrayList<Player>();
        
        Connection conn = Db.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM players JOIN weapons ON players.weapon = weapons.id " + filter);
        while(rs.next()){
            Player p = new Player();
            p.id = rs.getInt(1);
            p.name = rs.getString(2);
            
            p.weapon = new Weapon();
            p.weapon.id = rs.getInt(4);
            p.weapon.name = rs.getString(5);
            System.out.println(p);
            players.add(p);
            
        }
        return players;
    }
}
