
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Vladimir
 */
public class Server {
    public enum ServerStatus {Stopped, Running, Unknown}
    public int id;
    public String name;
    public ServerStatus status;
    
    public Server(){}
    
    public Server(String pars){
        
        String[] parsArray = pars.split("&");
        this.id = Integer.parseInt(parsArray[0].split("=")[1]);
        this.name = parsArray[1].split("=")[1];
        this.status = getStatus(parsArray[2].split("=")[1]);
        
    }
    public ServerStatus getStatus(String s){
        ServerStatus res = ServerStatus.Unknown;
        
        try {res = ServerStatus.valueOf(s);}catch(Exception ex){System.out.println("GReska pri dodeli statusa serveru!");}
        return res;
    }
    @Override
    public String toString(){
        return "Id: " + this.id + ", Name: "+this.name + ", Status: "+this.status;
    }
}
