/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample2;


import entities.Klub;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Vladimir
 */
public class HibernateExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = Engine.getSession();
        Transaction trans = session.beginTransaction();
        Klub klub = new Klub();
//        klub.naziv="Vojvodina";
//        klub.drzava ="Vojvodina";
//        
//        session.save(klub);
        klub = (Klub)session.get(Klub.class, 2);
        if(klub!=null){
            System.out.println(klub);
        }
        klub.setNaziv("Vojvodina");
        session.update(klub);
        
        trans.commit();
    }
    
}
