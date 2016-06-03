/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

/**
 *
 * @author Vladimir
 */


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
public class Main {
    static JFrame f;
    static JColorChooser jcc;
    public static void main(String[] args) 
    {
        f = new JFrame();
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
       jcc = new JColorChooser();
        JDialog dialog = JColorChooser.createDialog(null,"Choose color", true, jcc, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Color c = jcc.getColor();
                    f.getContentPane().setBackground(c);
                }
            }, null);
        dialog.setVisible(true);
        f.setVisible(true);
    }
}