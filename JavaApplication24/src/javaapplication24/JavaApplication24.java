/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication24;
import java.util.regex.*;

/**
 *
 * @author Vladimir
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pattern p = Pattern.compile("day of the week: [1-7]");
        Matcher m = p.matcher("day of the week: 5");
        System.out.println(m.find());
    }
    
}
