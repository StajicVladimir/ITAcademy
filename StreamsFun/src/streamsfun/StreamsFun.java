/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamsfun;
import java.io.*;

/**
 *
 * @author Vladimir
 */
public class StreamsFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //SomeInputStream sis = new SomeInputStream();
//        OutputStream os = new FileOutputStream("vlada.txt");
//        os.write('V');
//        os.write('l');
//        os.write('a');
//        os.write('d');
//        os.write('a');
        
//        InputStream is = new FileInputStream("vlada.txt");
//        System.out.println((char)is.read());
//        System.out.println((char)is.read());
//        System.out.println((char)is.read());
//        System.out.println((char)is.read());
//        System.out.println((char)is.read());
        Reader rdr = new FileReader("vlada.txt");
        BufferedReader br = new BufferedReader(rdr);
        
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        //char[5] tekst;
        
        /* while(true){
            int broj = sis.read();
            if (broj == -1)
                break;
            System.out.println(broj);
        }*/
       /* while(true){
            int broj=sis.read();
            if (broj == -1) break;
            System.out.print(broj);
        }*/
//        int broj;
//        while((broj=sis.read())!=-1){
//            System.out.println(broj);
//                    }
//        //System.out.println(sis.read());
//        
//        OutputStream ous = new SomeOutputStream();
//        
//        ous.write(10);
        
    }
    
}
