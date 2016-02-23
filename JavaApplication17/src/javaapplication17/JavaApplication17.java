/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.*;

/**
 *
 * @author Vladimir
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int a = 1;
//        
//        switch (a){
//            case 1:
//            {
//                System.out.println("1");
//                break;
//            }
//            case 2:
//            {
//                System.out.println("2");
//                break;
//            }
//            case 5:
//            {
//                System.out.println("5");
//                break;
//            }
//        }
        
        File path = new File(" ");
        System.out.println(path.getAbsolutePath());
        String[] s = path.list();
        for(int i=0; i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    
}
