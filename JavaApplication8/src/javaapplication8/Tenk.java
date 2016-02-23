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
public class Tenk extends Vozilo {
    
    int steta;
    float kalibar;
    
    public Tenk(String model, float brzina, int steta, float kalibar){
        super(model, brzina);
        this.steta = steta;
        this.kalibar = kalibar;
    }
    
    @Override
    public void prikazi(){
        System.out.println("Ispis karakteristika tenka!");
        super.prikazi();
        System.out.println("A ovo je iz Tenka!");
        System.out.println(" Steta: " + this.steta + " Kalibar: " + this.kalibar);
    }

    @Override
    public String toString() {
        return "A ovo je overriden toString Steta: " + this.steta + " Kalibar: " + this.kalibar + " model: "
                +this.model + " Brzina: " +this.brzina;
    }
    
    
}
