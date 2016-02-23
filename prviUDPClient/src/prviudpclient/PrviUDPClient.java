/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prviudpclient;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladimir
 */
public class PrviUDPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String poruka = " ";
        String ime = " ";
        try (DatagramSocket dClient = new DatagramSocket();){
            // TODO code application logic here

            Scanner crevo = new Scanner(System.in);
            System.out.print("Unesite ime: ");
            ime = crevo.nextLine();
            byte[] message = new byte[512];
            //Saljem ime da bi na serveru imao ime klijenta a posle ide while petlja za chat
            message = ime.getBytes();
            InetSocketAddress ep = new InetSocketAddress("127.0.0.1", 1000);
            DatagramPacket dp = new DatagramPacket(message,message.length,ep);
            dClient.send(dp);
            
            //primam ime servera
            dp = new DatagramPacket(message,message.length,ep);
            dClient.receive(dp);
            String serverIme = new String(dp.getData(),0,dp.getLength());
            System.out.println("Zapocet chat sa: " + serverIme);
            
            while(!poruka.equalsIgnoreCase("exit")){
            System.out.print(ime+": ");
            poruka = crevo.nextLine();
            message = poruka.getBytes();
            
            //ep = new InetSocketAddress("127.0.0.1", 1000);
            
            dp = new DatagramPacket(message,message.length,ep);
            dClient.send(dp);
            
            message = new byte[512];
            dp = new DatagramPacket(message,message.length,ep);
            dClient.receive(dp);
            System.out.println(serverIme+ ": "+new String(dp.getData(),0,dp.getLength()));
            }
        } catch (SocketException ex) {
            Logger.getLogger(PrviUDPClient.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException exIO){
            System.out.println("Greskaaa!!!!");
        }
    }
    
}
