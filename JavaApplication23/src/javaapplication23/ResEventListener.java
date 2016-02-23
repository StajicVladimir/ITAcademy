/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author Vladimir
 */
public class ResEventListener implements ReservoirListener {

    /**
     *
     * @param event
     */
    @Override
    public void statusChanged(ReservoirEvent event){
        System.out.println("Reservoir status: " + event.msg);
    }
}
