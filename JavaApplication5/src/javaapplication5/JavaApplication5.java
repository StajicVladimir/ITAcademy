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
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Nekretnina n = new Nekretnina("Nosa", 100);
        n.predstaviSe();
        
        Nekretnina n1 = new Nekretnina("Bezanija 45kvm", 15000);
        n1.predstaviSe();
        
        double cenaSaPorezom = n1.cenaSaPorezom();
        System.out.println("Cena nekretnine1 sa porezom je: " + cenaSaPorezom);
//        Nekretnina n = new Nekretnina("Novi Beograd, 100kvm", 100000);
////        n.opis="Novi Beograd, 100kvm";
////        n.cena = 100000;
//        //n.porez = 5;
//        n.cena +=(n.cena*Nekretnina.porez);
//        
//        Nekretnina n1 = new Nekretnina();
//        n1.opis = "Bezanija, 50,kvm";
//        n1.cena= 50000;
//        n1.cena+=(n1.cena*Nekretnina.porez);
//        
//        System.out.println(n.opis);
//        System.out.println(n.cena);
//      
//        System.out.println(n1.opis);
//        System.out.println(n1.cena);
//        
//        System.out.println("Porez za Nekretninu: " + Nekretnina.porez +"Porez n: "+n.porez + " Porez n1: "+n1.porez);
//        
//        n.hello();
//        n1.hello();
//        Nekretnina n = new Nekretnina();
//        
//        n.cena=15000;
//        n.opis = "Miljakovac 35kvm";
//        
//        //newpackage.NewClass nk = new newpackage.NewClass();
//        
//        //String njanja = nk.getOpis();
//        System.out.println("Cena: " + n.cena); 
//        System.out.println("Opis: "+ n.opis);
//        //System.out.println("Ona tamo u drugom paketu kaze: " + nk.getOpis());
        
        
    }
    
}
