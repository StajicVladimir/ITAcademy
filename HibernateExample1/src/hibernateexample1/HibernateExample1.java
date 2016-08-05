/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Vladimir
 */
public class HibernateExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Configuration cfg = new Configuration();
        cfg.configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                   .applySettings(cfg.getProperties()).build();
       
        SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
       
        Session session = sessionFactory.openSession();
        
        Klima k = new Klima();
        k.setModel("Ultra speed 1000");
        k.setModel("Mistuibushi");
        
        session.save(k);
        Klima k1 = (Klima)session.get(Klima.class, 1);
        
        System.out.println(k.getModel());
    }
    
}
