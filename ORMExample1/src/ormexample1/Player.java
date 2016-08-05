/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormexample1;

/**
 *
 * @author Vladimir
 */
public class Player {
    
    public int id;
    public String name;
    public Weapon weapon;
    
    @Override
    public String toString(){
       return "Name:" + this.name + ", weapon: "+this.weapon.name; 
    }
}
