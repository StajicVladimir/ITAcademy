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
public class Product {
    String nazivProizvoda;
    String barKod;//Recimo da je string...
    float osnovnaCena;
    static final float PDV = 20;/*Mozda ima vise smisla da je porez int
         ali ovako bi mogao da bude i 15.3% npr.*/
    Product(){}
    Product(String nazivProizvoda, String barKod, float osnovnaCena){
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCena = osnovnaCena;        
    }
    
    /**
     *
     * @return
     */
    public float cena(){
        return osnovnaCena + osnovnaCena*(PDV/100);
    }
    
    @Override
    public String toString(){
        return "Naziv: "+this.nazivProizvoda + ", Bar-kod: " +this.barKod + ", Osnovna cena: " + this.osnovnaCena;
    }
}
