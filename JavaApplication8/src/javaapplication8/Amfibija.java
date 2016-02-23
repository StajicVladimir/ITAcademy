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
public class Amfibija extends Vozilo{
    
    public Amfibija (String model, float brzina, int kapacitet, int plovnaBrzina){
        super(model,brzina);
        this.kapacitet = kapacitet;
        this.plovnaBrzina=plovnaBrzina;
    }
    @Override
    public void prikazi(){
        System.out.println("Ispis karakteristika Amfibije!");
        super.prikazi();
        System.out.println(" Kapacitet: " + this.kapacitet + " Plovna Brzina: " + this.plovnaBrzina);
    }
    int kapacitet;
    int plovnaBrzina;
}
