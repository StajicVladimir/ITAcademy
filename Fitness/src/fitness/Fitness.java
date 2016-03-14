/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;

import java.sql.Connection;
import java.sql.SQLException;
import model.DBHelper;
import model.Rezultat;

/**
 *
 * @author Vladimir
 */
public class Fitness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Rezultat rez = new Rezultat(1,"Dule",4,890);
        System.out.println(rez.toString());
        DBHelper dbh = new DBHelper();
       // Connection cn = dbh.connect();
        //dbh.add(rez);
        dbh.update(new Rezultat(1,"Uros",2.5,180));
        
    }
    
}
