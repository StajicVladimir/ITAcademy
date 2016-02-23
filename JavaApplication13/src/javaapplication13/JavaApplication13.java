/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Vladimir
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SpaceShip serenity = new SpaceShip("Serenity",100, (new Frame(0,0,100,30)), 3, 20, 40, 100);
        
       Enemy enemy = new Enemy("Sajlonac", 100, new Frame(0,0, 80,20), 5,20,100);
       Ikar ikar = new Ikar();
       serenity.crtaj();
       enemy.crtaj();
       
//        System.out.println(serenity.health);
//        enemy.pogodak(serenity);
//        System.out.println(serenity.health);
//        
//        enemy.pogodak(serenity);
//        System.out.println(serenity.health);
//       serenity.pogodjen(20);
//       System.out.println(serenity.health);
//       
//       serenity.pogodjen(20);
//       System.out.println(serenity.health);
       enemy.pogodak(serenity);
        System.out.println(serenity.health);
        enemy.pogodak(serenity);
        System.out.println(serenity.health);
        
        enemy.stunHit(serenity);
        enemy.stunHit(ikar);
    }
    
}
