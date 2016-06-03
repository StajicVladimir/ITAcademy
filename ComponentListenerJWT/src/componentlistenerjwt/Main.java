/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentlistenerjwt;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.addComponentListener(new ComponentListener() {
 
            public void componentResized(ComponentEvent e) {
                JOptionPane.showMessageDialog(null, "Window is resized");
            }
            public void componentMoved(ComponentEvent e) {
                JOptionPane.showMessageDialog(null, "Window is moved");
            }
 
            public void componentShown(ComponentEvent e) {
                JOptionPane.showMessageDialog(null, "Window is shown");
            }
 
            public void componentHidden(ComponentEvent e) {
                JOptionPane.showMessageDialog(null, "Window is hidden");
            }
        });
        
        
 
        f.setVisible(true);
    }
}