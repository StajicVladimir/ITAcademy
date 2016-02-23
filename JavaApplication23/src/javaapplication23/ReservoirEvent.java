/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.EventObject;

/**
 *
 * @author Vladimir
 */
public class ReservoirEvent extends EventObject{
    
    String msg;
    public ReservoirEvent(Object source, String msg) {
        super(source);
        this.msg=msg;
    }

   


    
}
