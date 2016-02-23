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
public class Vozilo {
    String model;
    float brzina;
    
    public Vozilo(String model, float brzina){
        this.model = model;
        this.brzina = brzina;
    }
    public void prikazi(){
        System.out.println("Ovo je parent (super.prikazi();");
        System.out.println("Model: " + this.model + " Brzina: " + this.brzina);
    }
}
