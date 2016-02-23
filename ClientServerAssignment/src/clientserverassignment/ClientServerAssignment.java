/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverassignment;

/**
 *
 * @author Vladimir
 */
public class ClientServerAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Server server = new Server();
        Thread serverThread = new Thread(server);
        serverThread.run();
        
        Client client = new Client();
        Thread clientThread = new Thread(client);
        clientThread.run();
        
        
        
    }
    
}
