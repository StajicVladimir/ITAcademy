/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting;

/**
 *
 * @author Vladimir
 */
public class KarticaTest {
    public void platiPorezTest(){
        Kartica k = new Kartica();
        int suma = 40;
        int ocekivano = 20;
        int dobijeno = k.platiPorez(suma);
        
        if(dobijeno != ocekivano){
            System.out.println("Error!!!");
        }else{
            System.out.println("metod works as expected!");
        }
    }
}
