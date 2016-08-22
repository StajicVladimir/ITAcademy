/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbinding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Vladimir
 */
public class JavaFXBinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntegerProperty a = new SimpleIntegerProperty(10);
        IntegerProperty b = new SimpleIntegerProperty(15);
        IntegerProperty res = new SimpleIntegerProperty(0);
        
        res.bind(a.add(b));
        System.out.println("Initial value of res: " + res.get());
        
        System.out.println("Changing dependencies.....");
        a.set(20);
        b.set(25);
        System.out.println("After change res is: "+res.get());
        
        System.out.println("Unbinding!!!!");
        res.unbind();
        
        System.out.println("Changing values!");
        a.set(100);
        b.set(100);
        System.out.println("After unbinding res is: "+res.get());
        
        System.out.println("************ Part two ***************");
        IntegerProperty x = new SimpleIntegerProperty(1);
        IntegerProperty y = new SimpleIntegerProperty(2);
        IntegerProperty z = new SimpleIntegerProperty(3);
        
        System.out.println("Values before binding: ");
        System.out.println("x: "+x.get()+", y: "+y.get()+", z: "+z.get());
        
        x.bindBidirectional(y);
        System.out.println("After binding X to Y:");
        System.out.println("x: "+x.get()+", y: "+y.get()+", z: "+z.get());
        
        x.bindBidirectional(z);
        System.out.println("After binding X to Z:");
        System.out.println("x: "+x.get()+", y: "+y.get()+", z: "+z.get());
        
        System.out.println("After changing Z:");
        z.set(55);
        System.out.println("x: "+x.get()+", y: "+y.get()+", z: "+z.get());
    }
    
}
