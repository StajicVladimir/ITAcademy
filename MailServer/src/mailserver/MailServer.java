/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailserver;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Vladimir
 */
public class MailServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Properties props = new Properties();
       
       props.setProperty("mail.smtp.host", "smtp.gmail.com");
       props.setProperty("mail.smtp.socketFactory.port", "465");
       props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
       props.setProperty("mail.smtp.auth", "true");
       props.setProperty("mail.smtp.port", "465");
       
       //***************************
       Authenticator aut = new Authenticator()
               {
                   @Override
 
                    protected PasswordAuthentication getPasswordAuthentication() {
 
                        return new PasswordAuthentication("vstajic@gmail.com", "Pilsner82ns");
 
                    }
               };
       //**************
       Session session = Session.getInstance(props, aut);
       //*************************************
       
       try{
          Message message = new MimeMessage(session);
 
            message.setFrom(new InternetAddress("vstajic@gmail.com"));
 
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("mirjanna@gmail.com"));
 
            message.setSubject("Test Java Mail");
 
            message.setText("Hello from Java!");
 
  
 
            Transport.send(message);
 
  
 
           
            
            
       }catch(MessagingException mex){
           System.out.println(mex.getMessage());
       }
    }
    
}
