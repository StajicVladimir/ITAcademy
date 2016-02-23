/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tacke = "[{id:10,x:10,y:20},{id:5,x:30,y:40},{id:2,x:2,y:7}]";
        
        List pozicije = new ArrayList();
        
        pozicije = UserPosition.parsePoint(tacke);
        
        for (Object p : pozicije) {
            UserPosition usp = (UserPosition)p;
            
            System.out.println("Pozicija objekta "+usp.id+" je: " + usp.point.x + " " + usp.point.y);
        }
       // System.out.println(Arrays.toString(tackeArray));
    }
    
}
