/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingprogressbar1;

/**
 *
 * @author Vladimir
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
 
public class Main {
 
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(new Runnable() {
 
            @Override
            public void run() {
                JFrame frame = new JFrame();
 
                JButton button = new JButton("Start");
                frame.add(button);
 
                JProgressBar progressBar = new JProgressBar(0, 1000000);
                frame.add(progressBar);
 
                button.addActionListener(new ActionListener() {
 
                    @Override
                    public void actionPerformed(ActionEvent e) {
 
                        SwingWorker swingWorker = new SwingWorker() {
 
                            int duration = 1000000;
 
                            @Override
                            protected Object doInBackground() throws Exception {
                                for (int i = 0; i < duration; i++) {
                                    System.out.println(i);
 
                                    if (i % 100 == 0) {
                                        publish(i);
                                    }
 
                                }
 
                                return null;
                            }
 
                            @Override
                            protected void done() {
                                System.out.println("Work done!");
                            }
 
                            @Override
                            protected void process(List chunks) {
                                progressBar.setValue((int) chunks.get(chunks.size() - 1));
                            }
 
                        };
 
                        swingWorker.execute();
 
                    }
                });
 
                frame.setLayout(new FlowLayout());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 400);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
 
    }
 
}
