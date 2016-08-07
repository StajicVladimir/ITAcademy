/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample3;


import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Vladimir
 */
public class HibernateUtil {
    private Session session;
    
    public static Session getSession(){
        Configuration config = new Configuration().configure();
        return config.buildSessionFactory(new StandardServiceRegistryBuilder()
                .applySettings(config.getProperties()).build()).openSession();
    }
}
