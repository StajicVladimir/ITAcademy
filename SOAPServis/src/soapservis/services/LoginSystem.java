/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapservis.services;

/**
 *
 * @author Vladimir
 */
public class LoginSystem {
    public String login(String username, String password){
        return "hello "+username+", "+ password;
    }
}
