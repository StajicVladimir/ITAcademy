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
public class Repo {
    public static void enterPlayer(Player p) throws SQLException{
        Connection conn = Db.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into players values (null, ?, ?)");
        ps.setString(1, p.name);
        ps.setInt(2, p.weapon.id);
        ps.execute();
    }
    
     public static void editPlayer(Player p) throws SQLException{
        Connection conn = Db.getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE players SET name= ?, weapon = ? WHERE id = ?");
        ps.setString(1, p.name);
        ps.setInt(2, p.weapon.id);
        ps.setInt(3, p.id);
        ps.execute();
    }
    
     public static void enterWeapon(Weapon w) throws SQLException{
        Connection conn = Db.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into weapons values (null, ?)");
        ps.setString(1, w.name);
        
        ps.execute();
    }
}
