/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexampleforenkeys;

import org.hibernate.Session;

/**
 *
 * @author Vladimir
 */
public class HibernateExampleForenKeys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Session session = new Engine.getSession();
        Session session = Engine.getSession();
        
          Club club = (Club)session.get(Club.class, 1);
          System.out.println(club.city.name);
          
//        City city = new City();
//        city.name = "Novi Sad";
//        
//        session.save(city);
//        
//        Club club = new Club();
//        club.name="Vojvodina";
//        club.city=city;
//        session.save(club);
    }
    
}
