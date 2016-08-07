/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexampleforenkeys;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Vladimir
 */
public class Engine {
    private static Session session = null;
    
    public static Session getSession(){
        
        if(session == null){
            Configuration config = new Configuration();
            config.configure("/hibernateexampleforenkeys/hibernate.cfg.xml");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
            session = sessionFactory.openSession();
            
        }
        return session;
    }
}
