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
public class Ikar implements Hitable, Stunnable {

    @Override
    public void pogodjen(int damage) {
        System.out.println("Ja sam invicible!!!!");
    }

    @Override
    public void stun(int stunTime) {
        System.out.println("Ikar ne moze da se stanuje!!! :D ");
    }
    
}
