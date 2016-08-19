/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saopwebbappdesktopclient;

import service.ConversionRate;
import service.ConversionRate_Service;

/**
 *
 * @author Vladimir
 */
public class SAOPWebbAppDesktopClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversionRate_Service crs = new ConversionRate_Service();
        ConversionRate cr = crs.getConversionRatePort();
        
        System.out.println(cr.rate("EUR", "RSD"));
    }
    
}
