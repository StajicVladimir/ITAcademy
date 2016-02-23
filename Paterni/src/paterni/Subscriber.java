/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paterni;

/**
 *
 * @author Vladimir
 */
public class Subscriber implements ISubscriber{
    public String name;
    
    public Subscriber(String name){
        this.name = name;
    }
    
    public void update (String args){
        System.out.println("Updated object: " + this.name + ", args: "+ args);
    }
}
