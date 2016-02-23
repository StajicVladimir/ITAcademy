/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Vladimir
 */
public class Nekretnina {
    String opis;
    double cena;
    final static double porez = 0.01;
    
    Nekretnina(){
        System.out.println("Ja sam Ziv!!!!");
    }
    Nekretnina (String opis, double cena){
        this.cena = cena;
        this.opis = opis;
    }
    
    void predstaviSe(){
        System.out.println("Opis: "+opis);
        System.out.println("Cena: "+cena);
    }
    
    double cenaSaPorezom(){
        return (cena + (cena*porez));
    }
    void hello(){
        System.out.println("Pozdrav!! Ja ne radim nista!!!!! :D ");
    }
}
