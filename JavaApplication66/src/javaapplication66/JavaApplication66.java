/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;
import java.awt.FlowLayout;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Vladimir
 */
public class JavaApplication66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(300, 100);
        MyComponent mc = new MyComponent();
        mc.setToolTipText("This is tooltip!");
        f.getContentPane().add(mc);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }
   }
    

