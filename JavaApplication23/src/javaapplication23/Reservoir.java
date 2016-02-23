/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vladimir
 */
public class Reservoir {
    private ArrayList <ReservoirListener> allListeners = new ArrayList <ReservoirListener>();
    private String status = "full";
    
    private synchronized void resEvent(){
        ReservoirEvent resEvent = new ReservoirEvent(this, status);
        Iterator listeners = allListeners.iterator();
        
        while (listeners.hasNext()){
            ((ReservoirListener)listeners.next()).statusChanged(resEvent);
            
        }
    }
    
    public synchronized void addResListener(ReservoirListener r1){
        allListeners.add(r1);
    }
    public synchronized void removeResListener (ReservoirListener r1){
        allListeners.remove(r1);
    }
    public void filRes(){
        this.status="full";
        resEvent();
        
    }
    public void emtyRes(){
        this.status="empty";
        resEvent();
    }
    
}
