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
public class Wine extends Product{
    float zapreminaBoce;
    static final float DODATNI_POREZ = 10;
    
    Wine(String nazivProizvoda, String barKod, float osnovnaCena, float zapreminaBoce){
        super(nazivProizvoda, barKod, osnovnaCena);
        this.zapreminaBoce = zapreminaBoce;
    }
    
    @Override
    public float cena(){
        return super.cena() + super.cena()*(DODATNI_POREZ/100);
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ", Zapremina boce: " + zapreminaBoce;
    }
}
