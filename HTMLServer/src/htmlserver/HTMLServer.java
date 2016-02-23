/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlserver;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 *
 * @author Vladimir
 */
public class HTMLServer {

    /**
     * @param args the command line arguments
     */
    
    //***********************************
     public static enum fileTypes {
 
  
 
        unknown, jpg, jpeg, html, txt, exe, gif, zip
 
    }
 
    public static HashMap<Integer, String> errorCodes;
 
    public static HashMap<fileTypes, String> fileTypesList;
 
  
 
    static fileTypes getFileType(String file) {
 
        fileTypes type = fileTypes.unknown;
 
        if (file.endsWith(".jpg")) {
 
            type = fileTypes.jpg;
 
        }
 
        if (file.endsWith(".jpeg")) {
 
            type = fileTypes.jpg;
 
        }
 
        if (file.endsWith(".exe")) {
 
            type = fileTypes.exe;
 
        }
 
        if (file.endsWith(".html")) {
 
            type = fileTypes.html;
 
        }
 
        if (file.endsWith(".txt")) {
 
            type = fileTypes.txt;
 
        }
 
        if (file.endsWith(".exe")) {
 
            type = fileTypes.exe;
 
        }
 
        if (file.endsWith(".gif")) {
 
            type = fileTypes.gif;
 
        }
 
        if (file.endsWith(".zip")) {
 
            type = fileTypes.zip;
 
        }
 
  
 
        return type;
 
    }
 
  
 
    static String createHeader(Integer errorCode, fileTypes type) {
 
        StringBuilder res = new StringBuilder();
 
        res.append("HTTP/1.0 ");
 
        res.append(errorCodes.get(errorCode));
 
        res.append("\r\n");
 
        res.append("Connection: close\r\n");
 
        res.append(fileTypesList.get(type));
 
        res.append("\r\n");
 
        return res.toString();
 
    }
    //**********************************
    public static void main(String[] args) {
        // TODO code application logic here
        //********************************************
        errorCodes = new HashMap<>();
 
        errorCodes.put(200, "200 OK");
 
        errorCodes.put(404, "404 Not found");
 
        errorCodes.put(500, "500 Internal Server Error");
 
  
 
        fileTypesList = new HashMap<>();
 
        fileTypesList.put(fileTypes.jpg, "Content-Type: image/jpeg\r\n");
 
        fileTypesList.put(fileTypes.html, "Content-Type: text/html\r\n");
        //***********************************
        while(true){
        try(ServerSocket sServer = new ServerSocket(1000)){
            
            System.out.println("Listening on port 1000");
            Socket cn = sServer.accept();
            System.out.println("Request accepted");
            BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
            BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());
            
            String req = bis.readLine();
            String reqPage = req.split(" ")[1].replace("/", "");
            
            fileTypes fType = getFileType(reqPage);
            File f = new File(reqPage);
            
            /*FileInputStream fs = new FileInputStream(reqPage);
            int readByte;
            while((readByte=fs.read())!= -1){
                bos.write((byte)readByte);
            }*/
             if (f.exists()) {
 
                    bos.write(createHeader(200, fType).getBytes());
 
                    int readByte;
 
                    FileInputStream fs = new FileInputStream(reqPage);
 
                    while ((readByte = fs.read()) != -1) {
 
                        bos.write((byte) readByte);
 
                    }
 
  
 
                } else {
 
                    bos.write(createHeader(404, fType).getBytes());
 
                }
                
        }catch(IOException ex){
            ex.printStackTrace();
            
        }
    }
    } 
}
