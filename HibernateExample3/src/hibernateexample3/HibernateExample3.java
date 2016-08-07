/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample3;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author Vladimir
 */
public class HibernateExample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        
        Actor a = new Actor();
        a.setName("Charlise Theron");
        ActorDetails ad = new ActorDetails();
        ad.setAddress(".....");
        a.setActorDetails(ad);
        ad.setActor(a);
        
//        Actor a = (Actor)session.get(Actor.class, 1);
//        ActorDetails ad = new ActorDetails();
//        ad.setAddress("ADresa gde zivi");
//        a.setActorDetails(ad);
//        ad.setActor(a);
//        session.save(ad);
//        session.save(a);
//        Movie m = (Movie)session.get(Movie.class, 7);
//        System.out.println(m);
//        for(Actor a:m.getActors()){
//            System.out.println(a.getName());
//        }
////        Genre genre = (Genre)session.get(Genre.class, 2);
//        
//        Movie m = new Movie();
//        m.setTitle("Matrix");
//        m.setGenre(genre);
//        
//        Set<Actor> actors = new HashSet<Actor>();
//        
//        Actor a1 = new Actor();
//        a1.setName("Keany Reeves");
//        Actor a2 = new Actor();
//        a2.setName("Carry Ann Moss");
//        Actor a3 = new Actor();
//        a3.setName("Lawrence Fishbourne");
//        
//        session.save(a1);
//        session.save(a2);
//        session.save(a3);
//        
//        actors.add(a1);
//        actors.add(a2);
//        actors.add(a3);
//        
//        m.setActors(actors);
//        session.save(m);
//        Genre g = (Genre)session.get(Genre.class, 2);
//        
//        Set<Movie> movies = g.getMovies();
//        for(Movie m: movies){
//            System.out.println(m);
      //  }
        //System.out.println(g.getMovies());
                
//        Movie m =(Movie)session.get(Movie.class, 1);
//        System.out.println(m);
//        Genre g = new Genre();
//        g.setNaziv("Thriller");
//        session.save(g);
//        
//        Movie m = new Movie();
//        m.setTitle("Prestige");
//        m.setGenre(g);
        
       // session.save(m);
        session.getTransaction().commit();
    }
    
}
