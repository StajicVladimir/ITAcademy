/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Vladimir
 */
public class Sale {
    private int id;
    private int buyer;
    private int product;
    private String date;

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
     * @return the buyer
     */
    public int getBuyer() {
        return buyer;
    }

    /**
     * @param buyer the buyer to set
     */
    public void setBuyer(int buyer) {
        this.buyer = buyer;
    }

    /**
     * @return the product
     */
    public int getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(int product) {
        this.product = product;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

  
}
