/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentserver;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vladimir
 */
public class Server {
    
    public Server(){
        try {
            ServerSocket sServer = new ServerSocket(1000);
            
            System.out.println("Server is up and running...\nWaiting....");
           // while(true){
            Socket cn = sServer.accept();
            System.out.println("Client accepted...");
            BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
            DataOutputStream bos = new DataOutputStream(cn.getOutputStream());
            int a,b,c;
            String input = bis.readLine();
            a=Integer.parseInt(input.trim());
            input = bis.readLine();
            b = Integer.parseInt(input);
            c = a+b;
            String rezultat = (Integer.toString(c)+"\n");
            
            bos.writeBytes(rezultat);
            
            System.out.println("Rezultat od "+a+" + " + b +" je: "+c);
           // }//od while
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

