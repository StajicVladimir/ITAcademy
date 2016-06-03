/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingthreads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author Vladimir
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
    Runnable myGUI = new
      Runnable() {
        public void run() {
            JFrame f = new JFrame();
            JButton btn = new JButton("click");
            btn.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                        SwingWorker sw = new SwingWorker() {
                        @Override
                        protected Object doInBackground() throws Exception {
                            for(int i=0;i<100000;i++)
                                System.out.println(i);
 
                            return null;
                        }
                        @Override
                        protected void done()
                        {
                            System.out.println("Job ended");
                        }
                        };
                        sw.execute();
                    }
                });
            f.add(btn);
            f.setSize(300, 300);
            f.setVisible(true);
            }};
            SwingUtilities.invokeAndWait(myGUI);
        }
}