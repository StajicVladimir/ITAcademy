/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Vladimir
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LocalDate d;
        String in = "23051986";
        try{
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
        DateTimeFormatter dtfOut = DateTimeFormatter.ofPattern("dd.MMM yyyy.");
        LocalDate d=LocalDate.parse(in,dtf);
        System.out.println(d.format(dtfOut));
        }catch (Exception ex){
            System.out.println(ex);
        }    
    }
    
}
