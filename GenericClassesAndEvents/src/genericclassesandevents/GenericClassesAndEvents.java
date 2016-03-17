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
//        List<String> bodyBuilders = new ArrayList();
//        bodyBuilders.add("Arnold Schwarzenegger");
//        bodyBuilders.add("Ronny Coleman");
//        
//        String bilder = bodyBuilders.get(0);
//        System.out.println(bilder);
        
        NewClass<Bilder> mojaKlasa;
        mojaKlasa = new NewClass();
        Bilder as = new Bilder();
        as.ime = "Arnold";
        mojaKlasa.data = as;
        mojaKlasa.f();
        
        NewClass<Gamer> mojaKlasa1 = new NewClass<>();
        Gamer g = new Gamer();
        mojaKlasa1.data=g;
        mojaKlasa1.f();
    }
    
}
