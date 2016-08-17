/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marshalling;

import country.Country;
import country.ObjectFactory;
import country.Root;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Vladimir
 */
public class Marshalling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
        // TODO code application logic here
        //*********creating Object for Marshalling/Unmarshalling
        //**** content of country source package is compiled from XSD!
        ObjectFactory objectFactory = new ObjectFactory();

        Country country = objectFactory.createCountry();

        country.setCapital("Belgrade");
        country.setName("Serbia");
        country.setCountryCode("SRB");
        country.setDescription("Serbia is blah blah blah.....");
        //**********Marshalling************
        JAXBContext jc = JAXBContext.newInstance("country");
        Marshaller m = jc.createMarshaller();
        m.marshal(country, new File("out.xml"));
        System.out.println("Marshalling done!");
        
        //*****Unmarshalling*******
        Unmarshaller u = jc.createUnmarshaller();
        
        Root root = (Root)u.unmarshal(new File("countries.xml"));
        List<Country> countries = root.getCountry();
        for(Country c : countries){
            System.out.println("Country: " + c.getName()+", capital: "+c.getCapital()+
                    ", code: "+ c.getCountryCode()+", description: "+c.getDescription());
        }
        
    }
        
        
    }
    

