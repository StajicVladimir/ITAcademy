/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.time.*;

/**
 *
 * @author Vladimir
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Server s = new Server("serverId=25&serverName=my name&serverStatus=Running");
        System.out.println(s);
        
        LocalTime time = LocalTime.now();
        int seconds=80;
        //for(int i=0; i<1000; i++)
        while(true){
            
            
                System.out.println("Hour: "+time.getHour() + ", Minutes: "+time.getMinute()+", Seconds: "+time.getSecond());
              
            }
        }
    }
    

