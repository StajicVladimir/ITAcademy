/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Digitron d = new Digitron();
        
        System.out.println("Dobrodosli u nas mali digitron!");
        
        System.out.println("Unesite prvi parametar: ");
        d.setA(scn.nextDouble());
        
        System.out.println("Unesite drugi parametar: ");
        d.setB(scn.nextDouble());
        
        System.out.println("add (A+B): " + d.add()
            + "\nsub (A-B): " + d.sub() + "\nsub (B-A): "+ d.subInv()+
                "\nmul (A*B): " + d.mul() +
                "\ndiv (A/B): " + d.div() +"\ndiv (B/A): " + d.divInv());
    }
    
}
