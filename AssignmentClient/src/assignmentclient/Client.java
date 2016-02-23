/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentclient;



import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladimir
 */
public class Client{
    
    public Client(){
        //System.out.println("hej");
        Frame f = new Frame("Digitron 1.0");
        LayoutManager lm = new FlowLayout();
        f.setLayout(lm);
        
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        TextField tf = new TextField(5);
        f.add(tf);
        Label sign = new Label("+");
        f.add(sign);
        TextField tf1 = new TextField(5);
        f.add(tf1);
        Label rezLabel = new Label("=");
        rezLabel.setPreferredSize(new Dimension(50,50));
        f.add(rezLabel);
        
        Button button = new Button("Potvrdi");
        f.add(button);
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                try {
                    Socket sock = new Socket("127.0.0.1", 1000);
                    System.out.println("Client is up and running....");
                    DataOutputStream bos = new DataOutputStream(sock.getOutputStream());
                    BufferedReader bin = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                    
                    String unos = tf.getText();
                    bos.writeBytes(unos+"\n");
                    unos = tf1.getText();
                    bos.writeBytes(unos+"\n");
                    String rezultat = bin.readLine();
                    System.out.println("Rezultat : "+rezultat);
                    rezLabel.setText("= "+rezultat);
                    
            
                } catch (IOException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        f.setSize(640,480);
        f.setVisible(true);
        
    }
}

