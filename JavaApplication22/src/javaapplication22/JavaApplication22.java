/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    static void show(ArrayList<? > os)
 
    {
        for(Object o : os)
        System.out.println(((Person)o).name);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        // TODO code application logic here
        ArrayList <String> al = new ArrayList<>();
        
        /*al.add("Vlada");
        String fromList = al.get(0);
        System.out.println("U listu je uneto: " + fromList);*/
        
//    ArrayList<Student> listStudent = new ArrayList<>();
//    ArrayList<Person> listPerson = new ArrayList<>();
//    
//    Person o = new Person();
//    o.name = "John";
//    
//    Student s = new Student();
//    s.name = "David";
//    s.idNumber = "25/25";
//    
//    listPerson.add(o);
//    
//    Person o1 = new Person();
//    o1.name="Vlada";
//    listPerson.add(o1);
//    listStudent.add(s);
// 
//    show(listPerson);
    
        
//        novaGenericka<Integer, String, String> ng = new novaGenericka<>();
//        
//        ng.a =5;
//        ng.b = "Vlada";
//        ng.c="Stajic";
//        
//        System.out.println("Id: " + ng.a + ", Ime: "+ ng.b +", Prezime: "+ng.c);
        
        Class polja = Class.forName("javaapplication22.polja");
        
//        for (Field field: polja.getFields()){
//            System.out.println("Naziv polja: " + field.getName());
//        }
        //System.out.println(polja.);
        Field field1 = polja.getField("polje1");
        field1.set(polja, "vlada");
        
        System.out.println(polja.getField("polje1"));
        
        
    }
    
}
