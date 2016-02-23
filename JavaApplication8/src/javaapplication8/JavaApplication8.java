/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Vladimir
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tenk t34 = new Tenk("T34", 40, 400, 120);
        /*t34.model = "t34";
        t34.brzina = 40;
        t34.steta = 400;
        t34.kalibar = 120;*/
        System.out.println(t34.model);
        
        Amfibija pt76 = new Amfibija("pt76", 100, 10, 10);
        
        
        System.out.println(pt76.model);
        
        t34.prikazi();
        pt76.prikazi();
        System.out.println(t34);
    }
    
}
