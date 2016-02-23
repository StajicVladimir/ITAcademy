/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paterni;

/**
 *
 * @author Vladimir
 */
public class Paterni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MojaKlasa a = MojaKlasa.getInstance();
        MojaKlasa b = MojaKlasa.getInstance();
        
        a.x = 20;
        b.x=100;
        
        System.out.println(a.x);
        
        //******Distributer i subscriber**********
        
        Distributer distributer = new Distributer();
        
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");
        Subscriber subscriber3 = new Subscriber("Subscriber 3");
        
        distributer.addSubscriber(subscriber1);
        distributer.addSubscriber(subscriber2);
        distributer.addSubscriber(subscriber3);
        
        distributer.sendUpdate("VAZNO!!!!!");
        
        distributer.cancelSubscriber(subscriber1);
        distributer.cancelSubscriber(subscriber3);
        
        distributer.sendUpdate("Novi update");
        
        //******* Factory class *********
        String user = "";
        
        User u = UserFactory.newUser(user);
        
        User.forName
        
    }
    
}
