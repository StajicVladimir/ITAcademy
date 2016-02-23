/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti1;

/**
 *
 * @author Vladimir
 */
public class Niti1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        boolean decrement = true;
        MyThread myThread = new MyThread();
        
        for(int i = 0; i< 10; i++){
            Thread t = new Thread(new MyThread(decrement));
           // t.setDaemon(true);
            
            t.start();
            decrement = (!decrement);
            System.out.println(decrement);
            //t.wait(50);;
           //System.out.println(t.getId());
           
        }
    }
    
}
