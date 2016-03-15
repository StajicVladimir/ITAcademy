/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclassesandevents;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public class GenericClassesAndEvents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List bodyBuilders = new ArrayList();
        bodyBuilders.add("Arnold Schwarzenegger");
        bodyBuilders.add("Ronny Coleman");
        
        String bilder = (String)bodyBuilders.get(0);
        System.out.println(bilder);
    }
    
}
