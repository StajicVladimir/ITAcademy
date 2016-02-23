/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osobe;

import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public class Osobe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ulaz = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986" +
"/Moscow";
        String[] parseArray = ulaz.split(" ");
        String[] tmp;
        ArrayList listaOsoba = new ArrayList();
        for(int i =0; i<parseArray.length; i++)
        {
         tmp = parseArray[i].split("/");
        
         listaOsoba.add( new Person( (tmp[0].split("\\.")[0]),(tmp[0].split("\\.")[1]), tmp[1], tmp[2]));
         //tmp = null;  
        }
        
        for(int i=0; i<listaOsoba.size();i++){
            System.out.println(listaOsoba.get(i));
        }
    }
    
}
