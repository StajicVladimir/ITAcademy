/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

import java.util.Date;

/**
 *
 * @author Vladimir
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String startDate  = "17 04 2016";
        
        Date trenutnoVreme;
        
        System.out.println("Game of thrones pocinje: "+startDate);
        
        while(true){
            trenutnoVreme = new Date();
            System.out.println("Da li je pocelo?");
            System.out.println("Trenutno vreme je: "+trenutnoVreme);
            Thread.sleep(1000);
        }
    }
    
}
