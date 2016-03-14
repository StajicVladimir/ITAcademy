/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Vladimir
 */
public class Rezultat {
    public int id;
    public String ime;
    public double km;
    public int vreme;
    
    public Rezultat(int id, String ime, double km, int vreme){
        this.id =id;
        this.ime = ime;
        this.km = km;
        this.vreme = vreme;
    }
    public Rezultat(String ime, double km, int vreme){
        
        this.ime = ime;
        this.km = km;
        this.vreme = vreme;
    }       
    public Rezultat(){
        
    }
    @Override
    public String toString(){
        return ("Id: "+this.id+", Ime: "+this.ime +", kilometara: "+this.km+", vreme: "+this.vreme);
    }
}
