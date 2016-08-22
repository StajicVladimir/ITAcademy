/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxproperty;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Vladimir
 */
public class Person {
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private StringProperty lastName = new SimpleStringProperty(this,"lastName","");
    private IntegerProperty age = new SimpleIntegerProperty(this,"age",0);
    
    public Person(){
        
    }
    
    public Person(String firstName, String lastName, int age){
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.age.set(age);
    }

    /**
     * @return the firstName
     */
    public StringProperty getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(StringProperty firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public StringProperty getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(StringProperty lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public IntegerProperty getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(IntegerProperty age) {
        this.age = age;
    }
}
