/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsdlesson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import movies.Movie;
import movies.Movies;

/**
 *
 * @author Vladimir
 */
public class XSDLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException, FileNotFoundException, SQLException {
        // TODO code application logic here
//        Performer performer = new Performer();
//        
//        performer.setId(10);
//        performer.setName("Pera");
//        performer.setInstrument("Orgulje");
//        performer.setDr("1982-24-11");
//        JAXBContext jaxb = JAXBContext.newInstance("muzika");
//        
//        Marshaller m = jaxb.createMarshaller();
//        
//        m.marshal(performer,new FileOutputStream("performer.xml"));
        
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "Fanta82ns");
          ResultSet rs = conn.createStatement().executeQuery("Select * from film");
          
          Movies movies = new Movies();
          while(rs.next()){
            Movie movie = new Movie();
            movie.setTitle(rs.getString("title"));
            movie.setDescription(rs.getString("description"));
            movie.setId(rs.getInt("film_id"));
            movie.setLength(rs.getInt("length"));

            movies.getMovie().add(movie);
          }
          JAXBContext jaxb = JAXBContext.newInstance("movies");
          Marshaller m = jaxb.createMarshaller();
          m.marshal(movies,new FileOutputStream("movies.xml"));
        
    }
    
}
