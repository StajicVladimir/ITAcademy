/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prviclient;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Vladimir
 */
public class PrviClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (Socket cn = new Socket("www.google.com", 80);
 
             BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
 
             BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());)
 
     {
 
         bos.write("GET /search?gws_rd=ssl#q=java+\r\n\r\n".getBytes());
 
         bos.flush();
 
         String line;
 
         while ((line = bis.readLine()) != null) {
 
             System.out.println(line);           
 
         }           
 
     }
 
     catch(IOException exception)
 
     {
 
         System.out.println(exception.getMessage());
 
     }
    }
    
}
