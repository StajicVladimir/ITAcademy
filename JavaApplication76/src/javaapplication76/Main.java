/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

/**
 *
 * @author Vladimir
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Main {
    static JFrame f;
    static Integer elapsed;
    public static void main(String[] args) {
        f = new JFrame();
        f.setSize(300,300);
        elapsed = 0;
        Timer t = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "I am done!");
            }
        });
        t.setRepeats(false);
        t.start();
        f.setVisible(true);
    }
}