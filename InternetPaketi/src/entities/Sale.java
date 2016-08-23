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


/**
 *
 * @author Vladimir
 */
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int brzina;
    private String protok;
    
    @Column(name = "trajanje_ugovora")
    private int trajanjeUgovora;
    
    @Column(name="ime_prezime") 
    private String imePrezime;
    private String adresa;

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
     * @return the brzina
     */
    public int getBrzina() {
        return brzina;
    }

    /**
     * @param brzina the brzina to set
     */
    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    /**
     * @return the protok
     */
    public String getProtok() {
        return protok;
    }

    /**
     * @param protok the protok to set
     */
    public void setProtok(String protok) {
        this.protok = protok;
    }

    /**
     * @return the trajanjeUgovora
     */
    public int getTrajanjeUgovora() {
        return trajanjeUgovora;
    }

    /**
     * @param trajanjeUgovora the trajanjeUgovora to set
     */
    public void setTrajanjeUgovora(int trajanjeUgovora) {
        this.trajanjeUgovora = trajanjeUgovora;
    }

    /**
     * @return the imePrezime
     */
    public String getImePrezime() {
        return imePrezime;
    }

    /**
     * @param imePrezime the imePrezime to set
     */
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    /**
     * @return the adresa
     */
    public String getAdresa() {
        return adresa;
    }

    /**
     * @param adresa the adresa to set
     */
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    @Override
    public String toString(){
        return "id: "+id+", brzina: "+this.brzina+", protok: "+ this.protok+
                ", trajanje: "+this.trajanjeUgovora+", korisnik: "+this.imePrezime+
                ", adresa:"+ this.adresa;
    }
}
