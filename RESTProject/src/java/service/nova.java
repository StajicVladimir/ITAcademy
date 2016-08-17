/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Vladimir
 */
@Path("/nova")
public class nova {
    @GET
    @Produces("text/xml")
    public String getMessage(){
        return "<root><Car><Name>A8</Name></Car><Car><Name>A6</Name></Car></root>";
    }
}
