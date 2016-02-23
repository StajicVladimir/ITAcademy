/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Vladimir
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rucak r = new Rucak();
        
        r.naziv = "Spagete bolonjeze";
        r.ocena = 10;
        r.slano = true;
        
        Rucak r1 = r;
        r1.ocena = 2;
        System.out.println("Naziv rucka je: "+r.naziv +
                "\nOcena rucka je: " + r.ocena + 
                "\nDa li je slan: " + r.slano);
    }
    
}
