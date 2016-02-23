/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prviserver;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vladimir
 */
public class PrviServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (ServerSocket sServer = new ServerSocket(1000);
        Socket cn = sServer.accept();
        BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
        BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream()))
        {
            String line = bis.readLine();
            while (line!=null && !line.equals("")){
                System.out.println(line);
                line = bis.readLine();
            }
            String req = bis.readLine();
            String reqPage = req.split(" ")[1].replace("/", "");
            FileInputStream fs = new FileInputStream(reqPage);
 
            int readByte;
 
            while((readByte=fs.read())!=-1)
                bos.write((byte)readByte);
            
            bos.write("Hello from server!!".getBytes());
        } catch (IOException ex) {
            System.out.println("Execption na portu 1000");
            System.out.println(ex.getMessage());
        }
        
    }
    
}
