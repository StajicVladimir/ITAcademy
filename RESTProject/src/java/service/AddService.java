/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Vladimir
 */
@Path("/AddService/{a}/{b}")
public class AddService {
    @GET
    public String getMessage(@PathParam("a") Integer a, @PathParam("b") Integer b){
        Integer res = a+b;
        return res.toString();
    }
}
