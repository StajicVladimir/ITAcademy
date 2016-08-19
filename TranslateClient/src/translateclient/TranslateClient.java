/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translateclient;

import rest.Translator;

/**
 *
 * @author Vladimir
 */
public class TranslateClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Translator t = new Translator();
        
        System.out.println(t.translate("vfvd", "srb", "de"));
    }
    
}
