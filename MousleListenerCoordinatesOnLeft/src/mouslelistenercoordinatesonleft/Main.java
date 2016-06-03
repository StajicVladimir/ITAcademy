/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouslelistenercoordinatesonleft;

/**
 *
 * @author Vladimir
 */
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Main {
    
     static JLabel mouseInfo;
     static JButton btn;
     
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse clicked on\nx: " + e.getX() + ", y: " + e.getY());
            }
        });
        
         mouseInfo = new JLabel();
        f.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseInfo.setText("Mouse position x: " + e.getX() + ", y: " + e.getY());
            }
        });
        
         btn = new JButton("X");
        f.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getWheelRotation()==1)
                    btn.setLocation(btn.getLocation().x, 5+btn.getLocation().y);
                else
                    btn.setLocation(btn.getLocation().x, btn.getLocation().y-5);
            }
        });
        f.add(btn);
        f.add(mouseInfo);
        f.setVisible(true);
    }
}