/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 *
 * @author Vladimir
 */
@Entity
public class ActorDetails {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "mygenerator", strategy = "foreign",
            parameters = @Parameter(name ="property", value="actor")
    )
    @GeneratedValue(generator="mygenerator")
    private int id;
    
    @OneToOne
    @PrimaryKeyJoinColumn
    private Actor actor;
    private String address;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the actor
     */
    public Actor getActor() {
        return actor;
    }

    /**
     * @param actor the actor to set
     */
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
