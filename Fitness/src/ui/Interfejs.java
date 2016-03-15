/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;
import model.Rezultat;

/**
 *
 * @author Vladimir
 */
public class Interfejs {
    public int meni(){
        Scanner s = new Scanner(System.in);
        System.out.println("1. Novi\n2. Brisi\n3. Edit\n4. Prikazi Sve\n5. Filter\n6. Logout\n7. Exit");
        System.out.print("Unesite vas izbor: ");
        return Integer.parseInt(s.nextLine());
    }
    
    public Rezultat getRezultat(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String ime = s.nextLine();
        System.out.println("Enter km: ");
        double km = Double.parseDouble(s.nextLine());
        System.out.println("Enter time: ");
        int vreme = Integer.parseInt(s.nextLine());
        
        return new Rezultat(ime, km, vreme);
        
    }
    public void izmeniRezultat(Rezultat rez){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String ime = s.nextLine();
        rez.ime = ime.isEmpty()? rez.ime:ime;
        System.out.println("Enter km: ");
        //double km = Double.parseDouble(s.nextLine());
        String kmString = s.nextLine();
        if(!kmString.isEmpty()){
            rez.km = Double.parseDouble(kmString);
        }
        System.out.println("Enter time: ");
        //int vreme = Integer.parseInt(s.nextLine());
        String vremeString  = s.nextLine();
        if (!vremeString.isEmpty()){
            rez.vreme=Integer.parseInt(vremeString);
        }
        
        
    }
    public int getId(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Unesite id: ");
        return Integer.parseInt(s.nextLine());
    }
    public String getIme(){
        Scanner s =new Scanner(System.in);
        System.out.println("Unesite ime: ");
        return s.nextLine();
    }
    public String[] login(){
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = s.nextLine();
        System.out.println("Unesite pass: ");
        String pass = s.nextLine();
        
        return new String[]{ime,pass};
    }
}