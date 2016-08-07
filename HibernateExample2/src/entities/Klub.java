/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author Vladimir
 */
@Entity
@Table(name = "klubovi")
//@DynamicUpdate(true) Updates only fields that have changed....
public class Klub {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_kluba")
    private int id;
    private String naziv;
    private String drzava;
    
    @Override
    public String toString(){
        return getId() +": " +getNaziv()+", "+getDrzava();
    }

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
     * @return the naziv
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * @param naziv the naziv to set
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    /**
     * @return the drzava
     */
    public String getDrzava() {
        return drzava;
    }

    /**
     * @param drzava the drzava to set
     */
    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }
}
