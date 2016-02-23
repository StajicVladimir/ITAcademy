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
public class Enemy extends FlyingObject{
    
    public int rockets;
    public int damage;
    public int health;
    public int stunTime = 4;

    public Enemy(String name, int speed, Frame frame, int rockets, int damage, int health) {
        super(name, speed, frame);
        this.rockets = rockets;
        this.damage = damage;
        this.health = health;
    }
    
    public void pogodak(Hitable pogodjeni){
        //pogodjeni.health-=this.damage;
        System.out.println("POGODAK!!!");
        //System.out.println("Pogodjen je: " + pogodjeni.name + " za " + this.damage + " stete!");
        pogodjeni.pogodjen(20);
    }
    public void stunHit(Stunnable pogodjeni){
        pogodjeni.stun(this.stunTime);
    }
    @Override
    public void crtaj(){
        System.out.println("|*|");
    }
}
