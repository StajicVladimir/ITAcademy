/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapservis;

import javax.xml.ws.Endpoint;
import soapservis.services.LoginService;

/**
 *
 * @author Vladimir
 */
public class SOAPServis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        LoginService ls = new LoginService();
//        System.out.println(ls.login("Vlada", "pass"));
        Endpoint.publish("http://localhost:8080/LoginServis", new LoginService());
        
    }
    
}
