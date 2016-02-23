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
public abstract class BaseObject {
    String name;
    Frame frame;
    
    public BaseObject(String name, Frame frame){
        this.name=name;
        this.frame=frame;
    }
    
    public abstract void crtaj();
}