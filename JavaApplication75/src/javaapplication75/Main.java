/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author Vladimir
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
public class Main {
    static SwingWorker sw;
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
    Runnable myGUI = new
      Runnable() {
        public void run() {
            JFrame f = new JFrame();
            f.setLayout(new FlowLayout());
            JButton btn = new JButton("Start");
            JButton btnC = new JButton("Cancel");
            btn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        sw = new SwingWorker<String,String>() {
 
                            @Override
                            protected void done()
                            {
                                try {
                                    if(!isCancelled())
                                        System.out.println(get());
                                    else
                                        System.out.println("Canceled");
                                }
                                    catch (InterruptedException ex) {  }
                                    catch (ExecutionException ex) {  }
                            }
                            @Override
                            protected String doInBackground() throws Exception {
                                int i = 0;
                                while(!isCancelled())
                                    {
                                        Thread.sleep(1000);
                                        publish("not done yet, i am on " + i++);
                                    }
                                return "I am done";
                            }
                            @Override
                            protected void process(List<String> chunks) {
                                 System.out.println(chunks.get(0));
                            }
                        };
                        sw.execute();
                     }
                });
            btnC.addActionListener(new ActionListener() {
 
                    public void actionPerformed(ActionEvent e) {
                            sw.cancel(true);
                    }
                });
            f.add(btn);
            f.add(btnC);
            f.setSize(300, 300);
            f.setVisible(true);
            }};
            SwingUtilities.invokeAndWait(myGUI);
        }
}