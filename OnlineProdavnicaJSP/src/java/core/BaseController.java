package core;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir
 */
public abstract class BaseController {
    public HttpServletRequest request;
    public HttpServletResponse response;
    
    public void view (String naziv){
        try{
        RequestDispatcher dispatcher = request.getRequestDispatcher(naziv + ".jsp");
        
        dispatcher.forward(request, response);
        }catch(Exception ex){
            ex.printStackTrace();
            
        }
    }
}
