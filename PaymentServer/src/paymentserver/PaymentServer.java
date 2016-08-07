/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentserver;

import entities.Card;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Vladimir
 */
public class PaymentServer {

    /**
     * @param args the command line arguments
     */
    static int pay(String cardNo, int amount){
        Session session = Engine.getSession();
        Transaction transaction = session.beginTransaction();
        Card card = (Card)session.get(Card.class, cardNo);
        if (card == null){
            transaction.rollback();
            return -1;
        }
        if((card.getBalance()-amount)<0){
            transaction.rollback();
            return -1;
        }
        try{
            card.setBalance(card.getBalance()-amount);
            
        }catch(HibernateException ex){
            transaction.rollback();
            return -1;
        }
        if(card.getBalance()<0){
            transaction.rollback();
            return -1;
        }
        transaction.commit();
        return card.getBalance();
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //System.out.println(pay("1234", 60));
       
        
        
        ServerSocket server = new ServerSocket(1400);
        System.out.println("Server is listening...");
        while(true){
            Socket socket = server.accept();
            System.out.println("Client accepted!");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream os = socket.getOutputStream();
            String incomingMessage =br.readLine();
            String[]imParse = incomingMessage.split(",");
            String cardNo = imParse[0];
            int amount = Integer.parseInt(imParse[1]);
            System.out.println(cardNo + ", "+ amount);
            String result = String.valueOf(pay(cardNo,amount));
            System.out.println("\nResult of payment: "+result);
            os.write((result+"\r\n").getBytes());
            socket.close();
            br.close();
            os.close();
        }
    }
    
}
