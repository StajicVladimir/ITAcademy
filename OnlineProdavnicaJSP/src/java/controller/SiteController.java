/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import core.BaseController;

/**
 *
 * @author Vladimir
 */
public class SiteController extends BaseController{
    
    public void home(){
        request.setAttribute("podatak", "Obican korisnik!");
        view("index");
    }
    
    public void cart(){
        view("cart");
        
    }
    
    public void details(){
        view("details");
    }
}
