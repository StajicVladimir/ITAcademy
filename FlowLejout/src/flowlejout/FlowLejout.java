/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlejout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;

/**
 *
 * @author Vladimir
 */
public class FlowLejout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LayoutManager layout = new FlowLayout(FlowLayout.LEFT);
        Frame f = new Frame("Novi frejm");
        f.setLayout(layout);
        
        for (int i = 1; i< 10; i++){
            f.add(new Button("Button: "+i));
        }
        f.setSize(600,600);
        f.setVisible(true);
        
    }
    
}
