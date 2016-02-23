/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public class JavaApplication19 {

    public enum DaysOfWeek {
JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(DaysOfWeek.values()[1]);
        LocalDate localDate = LocalDate.of(2000, 06, 30);
System.out.println(localDate.minusDays(1).getDayOfMonth());
    }
    
}
