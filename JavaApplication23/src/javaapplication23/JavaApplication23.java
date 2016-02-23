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
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Reservoir c = new Reservoir();
        
        c.addResListener(new ReservoirListener(){
        public void statusChanged(ReservoirEvent event){
            System.out.println("From Inline anonymus class!");
        }
    });
        
    c.filRes();
    c.emtyRes();
    }
    
}
