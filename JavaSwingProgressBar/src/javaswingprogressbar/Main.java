/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingprogressbar;

/**
 *
 * @author Vladimir
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.SwingWorker;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Main {
    static JProgressBar jpb;
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setLayout(new FlowLayout());
        myFrame.setSize(500,500);
        jpb = new JProgressBar();
        jpb.setStringPainted(true);
        jpb.setBorderPainted(false);
        jpb.setMaximum(100);
        
        JButton button = new JButton("Start");
                        button.addActionListener(new ActionListener() {
 
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    }
                    });
        JSlider jsl = new JSlider(0, 1000, 125);
        jsl.addChangeListener(new ChangeListener() {
       public void stateChanged(ChangeEvent e) {     
          System.out.println(((JSlider)e.getSource()).getValue());
       }
        });
        SwingWorker sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                    while(jpb.getValue()<jpb.getMaximum())
                    {
                        int currValue = jpb.getValue();
                        jpb.setValue(currValue+1);
                        Thread.sleep(100);
                    }
                JOptionPane.showMessageDialog(jpb, "Job done!");
                return null;
            }
        };
        sw.execute();
        myFrame.add(jpb);
        myFrame.add(jsl);
        myFrame.setVisible(true);
    }
}