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
public class SpaceShip extends FlyingObject implements Hitable, Stunnable{
    
    public int lives;
    public int rockets;
    public int damage;
    public int health;

    public SpaceShip(String name, int speed, Frame frame,int lives, int rockets, int damage, int health) {
        super(name, speed, frame);
        this.lives = lives;
        this.rockets = rockets;
        this.damage=damage;
        this.health = health;
        
    }
    
    /**
     *
     * @param dmg
     */
    @Override
    public void pogodjen(int dmg){
        this.health -=dmg;
        System.out.println("Pogodjen je: "+this.name + " za " + dmg + " stete.");
    }

    @Override
    public void crtaj() {
        System.out.println("~>=");
    }

    @Override
    public void stun(int stunTime) {
        System.out.println("O ne! "+this.name + " je stunovan na " + stunTime +" sekundi!");
    }
   
}
