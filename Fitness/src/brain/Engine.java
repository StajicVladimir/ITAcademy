/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

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
    
    void run(){
        System.out.println("Welcome to BEST Running tracker EVER! NOT!\nFitness logger V1.0 Alpha");
        while (true){
            int odabranaKomanda = ui.meni();
        }
    }
    
    public static void start(){
        Engine e = new Engine();
        e.run();
    }
}
