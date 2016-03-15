/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import java.sql.SQLException;
import java.util.List;
import model.*;
import ui.*;

/**
 *
 * @author Vladimir
 */
public class Engine {
    
    public Engine(){
        this.db = new DBHelper();
        this.ui = new Interfejs();
        
    }
    DBHelper db;
    Interfejs ui;
    
    void delete() throws SQLException{
        int id = ui.getId();
        db.delete(id);
    }
    void add() throws SQLException{
        Rezultat zaUnos = ui.getRezultat();
        db.add(zaUnos);
    }
    void edit() throws SQLException{
        int id = ui.getId();
        Rezultat r = db.get(id);
        ui.izmeniRezultat(r);
        db.update(r);
        
    }
    void showAll() throws SQLException{
        List all = db.get();
        for (Object all1:all){
            System.out.println(all1);
        }
    }
    void showFiltered()throws SQLException{
        String filter = ui.getIme();
        
        filter = " where ime = '"+filter+"'";
        List all = db.get(filter);
        for(Object all1:all){
            System.out.println(all1);
        }
    }
    void run() throws SQLException{
        System.out.println("Welcome to BEST Running tracker EVER! NOT!\nFitness logger V1.0 Alpha");
        mainloop: 
        while (true){
            int odabranaKomanda = ui.meni();
            switch(odabranaKomanda){
                case 1:
                    add();
                break;
                case 2:
                    delete();
                break;
                case 3:
                    edit();
                break;
                case 4:
                    showAll();
                break;
                case 5:
                    showFiltered();
                break;
                case 6:
                    break mainloop;
                case 7:
                    System.exit(0);
                    
            }
        }
    }
    
    public static void start() throws SQLException{
        Engine e = new Engine();
        while (true){
            String[] creds = e.ui.login();
            if(e.db.login(creds[0], creds[1]))
                e.run();
            else
                System.out.println("Wrong username and password");
        }
    }
}
