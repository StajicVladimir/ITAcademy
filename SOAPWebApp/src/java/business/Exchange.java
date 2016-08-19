/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Random;

/**
 *
 * @author Vladimir
 */
public class Exchange {
    public String rate(String a, String b){
       Random r = new Random() ;
        return "ratio for "+a+" to "+ b +"is: " + r.nextDouble();
    }
}
