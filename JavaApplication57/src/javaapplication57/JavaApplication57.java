/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Vladimir
 */
public class JavaApplication57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        InputStream cesma;
        OutputStream slivnik;
        
        cesma = new FileInputStream("pozicije.txt");
        slivnik = new FileOutputStream("izlaz.txt");
        int kap;
        //cesma.read();
//        int kap = cesma.read();
//        System.out.println("nja: "+kap);
//        System.out.println(cesma.read());
//        System.out.println(cesma.read());
//        System.out.println(cesma.read());
        while((kap = cesma.read()) != -1){
            System.out.println(kap);
            slivnik.write(kap);
            System.out.println("nja");
        }
        
        slivnik.write(9);
        
        
    }
    
}
