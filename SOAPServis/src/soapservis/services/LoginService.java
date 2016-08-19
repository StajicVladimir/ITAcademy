/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapservis.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Vladimir
 */
@WebService(name="loginService")
public class LoginService {
    
    @WebMethod(operationName = "login")
    public String login(String username, String password){
        LoginSystem ls = new LoginSystem();
        return ls.login(username, password);
    }
}
