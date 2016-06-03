/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
 
public class Main{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300,100);
        f.setLayout(new FlowLayout());
        JTextField tf = new JTextField("Press enter here",10);
        final JButton btn = new JButton("Not default button");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,"Button is pressed!");
            }
        });
        f.add(tf);
        f.add(btn);
 
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==10)
                    btn.doClick();
            }
        });
        f.setVisible(true);
    }
}