/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinglookandfeel;

/**
 *
 * @author Vladimir
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
 
public class Main {
 
    static SwingWorker sw;
    static JFrame f;
 
    public static void main(String[] args) throws InterruptedException, InvocationTargetException, UnsupportedLookAndFeelException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        Runnable myGUI = new Runnable() {
            @Override
            public void run() {
                f = new JFrame();
                f.setLayout(new FlowLayout());
                f.setSize(300, 300);
 
                JButton btnWin = new JButton("Windows");
                JButton btnMot = new JButton("Motif");
                JButton btnMetal = new JButton("Metal");
                btnWin.setActionCommand("win");
                btnMot.setActionCommand("mot");
                btnMetal.setActionCommand("metal");
                f.add(btnWin);
                f.add(btnMot);
                f.add(btnMetal);
                ActionListener changeLAF = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            if ("win".equals(e.getActionCommand())) {
                                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                            }
                            if ("mot".equals(e.getActionCommand())) {
                                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                            }
                            if ("metal".equals(e.getActionCommand())) {
                                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                            }
                        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                        }
                        SwingUtilities.updateComponentTreeUI(f);
                        f.pack();
                    }
                };
                btnMetal.addActionListener(changeLAF);
                btnWin.addActionListener(changeLAF);
                btnMot.addActionListener(changeLAF);
                f.pack();
                f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeAndWait(myGUI);
    }
}