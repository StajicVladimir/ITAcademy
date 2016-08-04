/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Vladimir
 */
public class Hibernate1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        // TODO code application logic here
//        Person person = new Person();
//        person.setName("John Deen");
//        //person.setPid("0002/dd");
//        person.setAge(33);
//        
//        JSONObject obj = new JSONObject();
//        
//        obj.put("name", person.getName());
//        //obj.put("pid", person.getPid());
//        obj.put("age", person.getAge());
//        
//        try {
//            FileWriter file = new FileWriter("test.json");
//            file.write(obj.toJSONString());
//            file.flush();
//            file.close();
//        } catch (IOException e) {
//            System.out.println("Error while writting JSON");
//        }
//        System.out.println("Object is in JSON form in file");
//        
//        JSONParser parser = new JSONParser();
//        
//        Object object = parser.parse(new FileReader("test.json"));
//        JSONObject jsonObject = (JSONObject) object;
//        
//        Person personOut = new Person();
//        
//        personOut.setName((String) jsonObject.get("name"));
//        //personOut.setPid((String) jsonObject.get("pid"));
//        personOut.setAge((int) (long) jsonObject.get("age"));
//
//        System.out.println(person.toString());
//**********************************************************************************
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonPU");
        EntityManager em = emf.createEntityManager();
        
        Person person = new Person("John Doe", 45, "Maverick Street");
        em.persist(person);
        
        
        
    }
    
}
