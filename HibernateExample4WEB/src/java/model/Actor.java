/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Vladimir
 */
@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    
    @OneToOne(mappedBy = "actor")
    private ActorDetails actorDetails;
    @ManyToMany
   @JoinTable(name = "movies_actors", 
           joinColumns = {@JoinColumn(name = "actorid")},
            inverseJoinColumns = {@JoinColumn(name="movieid")}
   )
    private Set<Movie> movies;
    
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the movies
     */
    public Set<Movie> getMovies() {
        return movies;
    }

    /**
     * @param movies the movies to set
     */
    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    /**
     * @return the actorDEtails
     */
    public ActorDetails getActorDetails() {
        return actorDetails;
    }

    /**
     * @param actorDEtails the actorDEtails to set
     */
    public void setActorDetails(ActorDetails actorDetails) {
        this.actorDetails = actorDetails;
    }
}
