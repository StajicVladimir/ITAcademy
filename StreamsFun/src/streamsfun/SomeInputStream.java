/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamsfun;
import java.io.*;
import java.util.Random;
/**
 *
 * @author Vladimir
 */
public class SomeInputStream extends InputStream{
    private int[] brojevi = {5,7,9,12};
    int marker = 0;
    @Override
    public int read(){
        
        if (marker>=brojevi.length) {
            return -1;
        }
        return brojevi[marker++];
        
        //return 1;
        /*Random r = new Random();
        
        int res = r.nextInt(100);                
        if (res == 50)
            return -1;
        else
            return res;*/
    }
    
}
