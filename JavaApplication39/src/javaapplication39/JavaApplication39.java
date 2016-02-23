/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author Vladimir
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Border Layout!");
        
        Button b1 = new Button("TOP_BUTTON");
        Button b2 = new Button("BOTTOM_BUTTON");
        Button b3 = new Button("CENTER_BUTTON");
        Button b4 = new Button("LEFT_BUTTON");
        Button b5 = new Button("RIGHT_BUTTON");
        
        f.add(b1, BorderLayout.PAGE_START);
        f.add(b2, BorderLayout.PAGE_END);
        f.add(b3, BorderLayout.CENTER);
        f.add(b4, BorderLayout.LINE_START);
        f.add(b5, BorderLayout.LINE_END);
        
        f.setSize(600,600);
        f.setVisible(true);
        
    }
    
}
