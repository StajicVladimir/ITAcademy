/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingtry;

import javax.swing.JFrame;

/**
 *
 * @author Vladimir
 */
public class MyFrame extends JFrame{
    public MyFrame(){
        initComponents();
    }
    void initComponents(){
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
