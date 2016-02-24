/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

import java.util.Random;

/**
 *
 * @author Vladimir
 */
public class ExceptionIgrarije{

    /**
     * @param args the command line arguments
     */
    static void voziMotor()throws Exception{
        Random r = new Random();
        boolean motorPokvaren = r.nextBoolean();
        
        if (!motorPokvaren) {
            System.out.println("Sve je OK! Vozim motor!");
        }else{
            System.out.println("Motor je pokvaren!!");
            
            PokvarenMotorException exPokvarenMotor = new PokvarenMotorException();
            
            throw exPokvarenMotor;
        }
    }
    static void voziTrku()throws Exception{
        Random r = new Random();
        int fogPercentage = r.nextInt(5);
        if (fogPercentage<3) {
            System.out.println("Sve ok, Nema magle!!!!");
          //  try{
            voziMotor();
            //}catch(Exception ex){
              //  System.out.println("Motor se pokvario!! Nosi ga sa staze!");
            //}
        }else{
            System.out.println("Nema trke. Magla je");
            throw new MaglaException();
        }
    }
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try{
            voziTrku();
        }catch(PokvarenMotorException exPom){
            System.out.println("Pokvario se motor!!! skloni ga sa staze");
        }catch(MaglaException exM){
            System.out.println("Magla je! Nema trke");
        }    
        
    }
    
}
