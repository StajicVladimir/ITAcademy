/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication96;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Vladimir
 */
public class Colorfull extends javax.swing.JFrame {

    private Color color;
    private int interval;
    private static Container cp;
     ActionListener timerAL = new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                            
                            JOptionPane.showMessageDialog(null, "Blaaa");
                        
                        color = Color.BLUE;
                        
                    }
                };
    /**
     * Creates new form Colorfull
     */
    public Colorfull() {
        initComponents();
        cp = this.getContentPane();
    }
    public Colorfull(Color c, int interval) throws InterruptedException {
        initComponents();
        this.color=c;
        this.interval = interval;
         //this.jLabel2.setOpaque(true);
        
        initComponents();
        System.out.println(interval);
        
        
        Timer t = new Timer(interval,timerAL);
               t.setRepeats(true);
               t.start();
               
              
             //JOptionPane.showMessageDialog(null, "Blaaa");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
