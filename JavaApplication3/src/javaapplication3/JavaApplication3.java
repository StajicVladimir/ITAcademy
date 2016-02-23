/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int x = 1;
//        
//        int y = x << 2;
        Scanner crevo = new Scanner(System.in);
        int polaznik = 1;
        int predavac = 2;
        int manager = 4;
        
        int ulogovaniKorisnik;
        int maska = predavac | manager;
        
        System.out.println("Dobro dosli u nas mali program za sve i svasta!\nMolim unesite vas nivo pristupa:"
                + "\nPolaznik   1\npredavac   2\nManager    4\nNivo pristupa: ");
        ulogovaniKorisnik = crevo.nextInt();
        
        //int ulogovaniKorisnik = 8;
        System.out.println(ulogovaniKorisnik & maska);
        if ((ulogovaniKorisnik & maska) != 0)
            System.out.println("Ulogovani korisnik ima pristup!");
        else
            System.out.println("Ulogovani korisnik nema pristup!");
        //System.out.println("");
       //System.out.println("Hello!! x: " +y);
    }
    
}
