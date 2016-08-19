/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapclient;

import soapservis.services.LoginService;
import soapservis.services.LoginServiceService;

/**
 *
 * @author Vladimir
 */
public class SOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginServiceService lss = new LoginServiceService();
        LoginService ls = lss.getLoginServicePort();
        
        String res = ls.login("vlada", "pass");
        System.out.println(res);
    }
    
}
