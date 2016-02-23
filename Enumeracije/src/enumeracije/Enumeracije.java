/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracije;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class Enumeracije {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Unesite figuru: ");
        Figure odigranaFigura = Figure.valueOf(new Scanner(System.in).nextLine());
        
        System.out.println(odigranaFigura);
        switch (odigranaFigura){
            case Konj:
                System.out.println("Odigran je Konj");
                System.out.println(odigranaFigura.broj);
                break;
            case Pesak:
                System.out.println("Odigran je Pesak");
                break;
            case Lovac:
                System.out.println("Odigran je Lovac");
                break;
            case Kralj:
                System.out.println("Odigran je Kralj");
                break;
            
        }
        System.out.println(odigranaFigura.broj);
                
    }
    
}
