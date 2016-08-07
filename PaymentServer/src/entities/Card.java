/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Vladimir
 */
@Entity
@Table (name="cards")
public class Card {
    
    @Id
    private String cardNo;
    private int balance;

    /**
     * @return the cardNo
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
