/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Vladimir
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int  brojPozitivnih = 0;
        int brojNegativnih = 0;
        int brojacPoz;
        int brojacNeg;
        
        //Prvo da izbrojimo koliko ima pozitivnih i koliko negativnih
        for(int i =0; i< array.length; i++){
            if(array[i]<0)
                brojNegativnih++;
            else if (array[i] > 0)
                brojPozitivnih++;
        }
        
        System.out.println(brojPozitivnih+ " " + brojNegativnih);
        /*Pravimo dva niza. Po jedan za pozitivne i negativne vrednosti,
        sa odgovarajucim brojem clanova*/
        int [] nizPozitivnih = new int[brojPozitivnih];
        int [] nizNegativnih = new int[brojNegativnih];
        
        brojacPoz=0;
        brojacNeg=0;
        /*Sada ponovo prolazimo kroz ceo niz i upisujemo
        pozitivne i negativne vrednosti u odgovarajuci niz.
        U ovoj petlji vrsimo i ispis zadatog niza
        da ne bi posle prolazili jos jednom kroz nju*/
        System.out.println("Zadati niz je: ");
        for(int i = 0; i<array.length; i++){
            if (array[i]>0){
                nizPozitivnih[brojacPoz] = array[i];
                brojacPoz++;//uvecavamo brojac koji koristimo za upisivanje u pozitivne
            }else if(array[i]<0){
                nizNegativnih[brojacNeg] = array[i];
                brojacNeg++;
            }
            System.out.print(array[i]+", ");// Ovde ispisujemo zadati niz
        }//Kraj druge for petlje
        //Sada samo ispis razvrstanih nizova 
        System.out.println("\nNiz pozitivnih vrednosti: ");
        for (int i =0; i<brojacPoz; i++){
            System.out.print(nizPozitivnih[i] + ", ");
        }
        System.out.println("\nNiz negativnih vrednosti: ");
        for (int i = 0; i<brojacNeg; i++){
            System.out.print(nizNegativnih[i] + ", ");
        }
        
        //int brojDuplikata = nadjiDuplikate(array);
        int brojDuplikata=0;
        int ukupnoDupliranihVrednosti=0;
        
        for (int i = 0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if (array[i]==array[j])
                    brojDuplikata++;
                   // ukupnoDupliranihVrednosti++;
            }
            if(brojDuplikata>0){
                System.out.println("Broj " + array[i] + " se javlja "+(brojDuplikata +1)
                + " puta u nizu!");
                ukupnoDupliranihVrednosti++;
            }
            brojDuplikata=0;
        }
        
        System.out.println("\nBroj vrednosti koje su duplirane je: "+ ukupnoDupliranihVrednosti);
    }
    public static int nadjiDuplikate(int[] array){
        
        int brojDuplikata=0;
        
        for (int i = 0; i<array.length; i++)
            for(int j=i+1; j<array.length; j++){
                if (array[i]==array[j])
                    brojDuplikata++;
            }
        return brojDuplikata;
    }
    
  /*  public static int izbrojPozitivneiNegativne(int [] array){
        
    }*/
}
