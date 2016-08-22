/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxproperty;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Vladimir
 */
public class JavaFXProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntegerProperty counter = new SimpleIntegerProperty(1);
        int counterValue = counter.getValue();
        System.out.println("Counter: " + counterValue);
        counter.set(2);
        counterValue = counter.getValue();
        System.out.println("Counter: "+counterValue);
    }
    
}
