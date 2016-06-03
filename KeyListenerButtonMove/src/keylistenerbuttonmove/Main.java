/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keylistenerbuttonmove;

/**
 *
 * @author Vladimir
 */
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        JButton btn = new JButton("X");
        btn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                JButton sender = (JButton)e.getSource();
                switch(e.getKeyCode())
                {
                    case KeyEvent.VK_RIGHT:
                        sender.setLocation(5+sender.getLocation().x, sender.getLocation().y);
                        break;
                     case KeyEvent.VK_LEFT:
                        sender.setLocation(sender.getLocation().x-5, sender.getLocation().y);
                        break;
                      case KeyEvent.VK_UP:
                        sender.setLocation(sender.getLocation().x, sender.getLocation().y-5);
                        break;
                      case KeyEvent.VK_DOWN:
                        sender.setLocation(sender.getLocation().x, 5+sender.getLocation().y);
                        break;
                }
            }
        });
        f.add(btn);
        f.setVisible(true);
    }
}