/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author Vladimir
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Frame f = new Frame("Jedan java kontejner");
        Label lbl = new Label("This is component");
        f.add(lbl);
        f.setSize(300, 100);
        Label l = new Label("Nova labela");
        f.add(l);
        f.setVisible(true);
        
       // Thread.sleep(2000);
        f.setLocation(100, 200);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we){
                System.exit(1);
            }
        });
        
        
    }
    
}
