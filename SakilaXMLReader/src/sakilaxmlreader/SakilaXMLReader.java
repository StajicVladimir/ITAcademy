/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakilaxmlreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import movies.Movie;
import movies.Movies;

/**
 *
 * @author Vladimir
 */
public class SakilaXMLReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        // TODO code application logic here
        JAXBContext jaxb = JAXBContext.newInstance("movies");
        
        Unmarshaller unm = jaxb.createUnmarshaller();
        //********movies.xml is copied but in project XSDLesson it is created from sakila... 
        Movies movies = (Movies)unm.unmarshal(new FileInputStream("movies.xml"));
        
        for(Movie m : movies.getMovie()){
            System.out.println(m.getTitle());
        }
    }
    
}
