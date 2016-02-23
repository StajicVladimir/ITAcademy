/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailprijem;

import java.util.Properties;

/**
 *
 * @author Vladimir
 */
public class MailPrijem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Properties props = new Properties();
 
        props.setProperty("mail.store.protocol", "imaps");
 
        Session session = Session.getInstance(props);
    }
    
}
