/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingfun3;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Vladimir
 */
public class JavaSwingFun3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(new Dimension(250,150));
        
        
        JPanel redPnl = new JPanel();
        redPnl.setBackground(Color.red);
        redPnl.setPreferredSize(new Dimension(100,100));
        redPnl.add(new Button("Red"));
        redPnl.add(new Button("Button"));
        redPnl.add(new Button("Group"));
        
        JPanel grnPnl = new JPanel();
        grnPnl.setBackground(Color.green);
        grnPnl.setPreferredSize(new Dimension(100,100));
        grnPnl.add(new Button("Green"));
        grnPnl.add(new Button("Button"));
        grnPnl.add(new Button("Group"));
        
        jFrame.add(redPnl);
        jFrame.add(grnPnl);
        
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    
}
