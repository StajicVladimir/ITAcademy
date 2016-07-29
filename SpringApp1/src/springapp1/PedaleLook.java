/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp1;

import org.springframework.stereotype.Component;

/**
 *
 * @author Vladimir
 */
@Component
public class PedaleLook extends Pedale{

    @Override
    public void pedaliraj() {
        System.out.println("Jupiii!!! Look pedale");
    }
    
}
