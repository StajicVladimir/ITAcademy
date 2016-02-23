/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracije;

/**
 *
 * @author Vladimir
 */
public enum Figure {
    Konj(1), Top(3), Pesak(2), Lovac(5), Kralj(7), Kraljica(10);
    int broj;
    
    Figure(int broj){
        this.broj = broj;
    }
}
