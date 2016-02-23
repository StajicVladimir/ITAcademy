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
public class MyThread implements Runnable{
    public boolean decrement;
    public MyThread(){
        System.out.println("Nit je napravljena!!!");
    }
    public MyThread (boolean decrement){
        this.decrement = decrement;
    }
    public void run(){
        if (decrement){
            for (int i =11; i>0; i--){
               System.out.println(i + "ja sam nit: " + Thread.currentThread().getId());
            
              try{
                  Thread.sleep(500);
              }catch(InterruptedException ex){
                   ex.printStackTrace();
               }
        }
        }else
        {
            for (int i =1; i<11; i++){
               System.out.println(i + "ja sam nit: " + Thread.currentThread().getId());
            
              try{
                  Thread.sleep(500);
              }catch(InterruptedException ex){
                   ex.printStackTrace();
               }
            }
        }
            
        //System.out.println("Zdravo iz nitiiii!!!!!");
    }
}
