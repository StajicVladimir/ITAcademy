/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jswingsystemtray;

/**
 *
 * @author Vladimir
 */
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
 
public class Main {
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                JFrame myFrame = new JFrame();
                myFrame.setSize(300, 300);
                myFrame.setLayout(new FlowLayout());
                PopupMenu pum = new PopupMenu();
                MenuItem miHello = new MenuItem("Say hello!");
                MenuItem miClose = new MenuItem("Close");
                miClose.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                miHello.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Hello!");
                    }
                });
                pum.add(miHello);
                pum.add(miClose);
 
                SystemTray st = SystemTray.getSystemTray();
                try {
                    Image img = ImageIO.read(new File("star.png"));
                    TrayIcon myTray = new TrayIcon(img);
                    myTray.setPopupMenu(pum);
                    st.add(myTray);
                } catch (Exception ex) {
                    System.out.println("No System tray! " );
                    ex.printStackTrace();
                }
                myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                myFrame.setVisible(true);
            }
        });
    }
}