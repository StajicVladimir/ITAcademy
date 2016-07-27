package springapp1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir
 */
public class Bicikli {
    private Pedale pedale;
    public Bicikli(){}
    public Bicikli(Pedale pedale){
        this.pedale = pedale;
    }

    /**
     * @return the pedale
     */
    public Pedale getPedale() {
        return pedale;
    }

    /**
     * @param pedale the pedale to set
     */
    public void setPedale(Pedale pedale) {
        this.pedale = pedale;
    }
}
