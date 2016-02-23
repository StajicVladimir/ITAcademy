/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paterni;

import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public class Distributer implements IDistributer {
    ArrayList<Subscriber> subscribers;
    
    public Distributer(){
        this.subscribers = new ArrayList<Subscriber>();
    }
    
    public void addSubscriber(Subscriber s){
        this.subscribers.add(s);
    }
    public void cancelSubscriber(Subscriber s){
        this.subscribers.remove(s);
        
    }
    public void sendUpdate (String msg){
        for (int i =0; i<subscribers.size(); i++){
            subscribers.get(i).update(msg);
        }
    }
}
