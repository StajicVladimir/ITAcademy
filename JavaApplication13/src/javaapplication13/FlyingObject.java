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
public abstract class FlyingObject extends BaseObject {
    
    public int speed;
    
    
    public FlyingObject(String name, int speed, Frame frame){
        super(name,frame);
        this.speed=speed;
        
        
    }
}
