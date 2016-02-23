/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proizvodi;

/**
 *
 * @author Vladimir
 */
public class Proizvodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product p = new Product("Pivo Paulaner", "09983738999ddd03", 100);
        Wine v = new Wine("Verdejo Rueda", "09848DF099FD", 1000, (float) 0.75);
        Chocolate c = new Chocolate("Lindt kakao 80%", "099DFDS000FDS", 200, 100);
        
        System.out.println("!Product!");
        System.out.println(p);//toString
        System.out.println("Cena sa PDV: " + p.cena());//Puna cena
        
        System.out.println("!Wine!");
        System.out.println(v);
        System.out.println("Cena Vina sa porezom je: " + v.cena());
        
        
        System.out.println("!Chocolate!");
        System.out.println(c);
        System.out.println("Cena Cokolade sa porezom je: " + c.cena());       
    }
    
}
