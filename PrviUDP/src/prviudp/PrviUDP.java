/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prviudp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladimir
 */
public class PrviUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       int brojKlijenta=0;
       
        try(DatagramSocket dServer = new DatagramSocket( new InetSocketAddress("127.0.0.1",1000));) {
            // TODO code application logic here
            byte[] buff = new byte[512];
            String poruka = " ";
            String odgovor = " ";
            
            Scanner crevo = new Scanner(System.in);
            DatagramPacket p = new DatagramPacket(buff,buff.length);
            System.out.println("Listening....");
            dServer.receive(p);
            
            String ime = new String(p.getData(),0,p.getLength());
            System.out.println("Zapocet chat sa: " + ime);
            //Saljem svoje ime
            System.out.println("Unesite ime: ");
            String mojeIme = crevo.nextLine();
            buff = mojeIme.getBytes();
            p= new DatagramPacket(buff, buff.length,p.getAddress(),p.getPort());
            dServer.send(p);
            
            while(!poruka.equalsIgnoreCase("exit")){    
                buff = new byte[512];
                p = new DatagramPacket(buff,buff.length);
                
                dServer.receive(p);
                poruka = new String(p.getData(),0,p.getLength());
                System.out.println(ime+": "+poruka);
                System.out.print(mojeIme+ ": ");
                //String clientName = new String(p.getData(),0, p.getLength());
                //System.out.println(clientName+" connected...");
               /* System.out.println("Server running......");
                 String message = new String(p.getData(),0,p.getLength());
                  System.out.println(message);*/
                  /*System.out.println("Broj klijenata: " + ++brojKlijenta);
                  
                  String response = "Hello to " + clientName + " from server!\n"
                          + "Vi ste klijent broj: "+brojKlijenta;*/
                odgovor = crevo.nextLine();
                buff = odgovor.getBytes();
                  p= new DatagramPacket(buff, buff.length,p.getAddress(),p.getPort());
                  System.out.println("Sending response....");
                  dServer.send(p);
             }   
        } catch (SocketException ex) {
            Logger.getLogger(PrviUDP.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException iEx){
            
        }
    }
    
}
