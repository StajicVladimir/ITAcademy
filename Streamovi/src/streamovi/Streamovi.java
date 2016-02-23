/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamovi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Vladimir
 */
public class Streamovi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String myText = "Hello world!!!\nNovi red\nAj da probamo i čćšđ";
        String s = new String(" ");
        
//        try (FileOutputStream fs = new FileOutputStream("d:\\NoviFajl.txt");){
//            fs.write(myText.getBytes());
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
//        
//        try (FileInputStream fsOut = new FileInputStream("d:\\NoviFajl.txt");){
//            int content = fsOut.read();
//            System.out.println("Ispis iz fajla!!!");
//            while(content!=-1){
//                
//                System.out.print((char)content);
//                content = fsOut.read();
//            }
//            System.out.println(" ");
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Unesite komandu: ");
        s = in.readLine();
        
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    try(FileWriter fw = new FileWriter("d:\\NoviFajlFW.txt");){
        System.out.println("Upis u fajl!!!");
        fw.write(s);
        System.out.println("Upis u fajl prosao ok!");
    }catch(IOException ex){
        ex.printStackTrace();
    }
    
    try(FileReader fr = new FileReader("d:\\NoviFajlFW.txt");){
        int c;
        System.out.println("Citam iz fajla!");
        while( (c=fr.read()) != -1){
            System.out.print((char)c);
        }
        System.out.println("");
    }catch(IOException ex){
        System.out.println(ex);
    }
    }
}
