/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proizvodi;

/**
 *
 * @author Vladimir
 */
public class Chocolate extends Product{
    float tezina;
    
    Chocolate(String nazivCokolade, String barKod, float cena, float tezina){
        super(nazivCokolade,barKod,cena);
        this.tezina = tezina;  
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Tezina cokolade: " + this.tezina;
    }
}
